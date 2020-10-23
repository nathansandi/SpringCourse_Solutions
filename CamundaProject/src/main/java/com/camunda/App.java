package com.camunda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.GatewayDirection;
import org.camunda.bpm.model.bpmn.instance.FlowNode;
import org.camunda.bpm.model.bpmn.instance.Gateway;
import org.camunda.bpm.model.bpmn.instance.SequenceFlow;
import org.camunda.bpm.model.bpmn.instance.ServiceTask;
import org.camunda.bpm.model.bpmn.instance.StartEvent;
import org.camunda.bpm.model.bpmn.instance.UserTask;
import org.camunda.bpm.model.dmn.instance.List;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Hello world!
 *
 */
public class App 
{	
	private static final String URL = "https://n35ro2ic4d.execute-api.eu-central-1.amazonaws.com/prod/engine-rest/process-definition/key/invoice/xml";

	
	public static void main( String[] args)  throws IOException, JSONException
    {
			try {
				String input1=args[0];//args[0];
				String input2=args[1];

		        JSONObject json = readJsonFromUrl();
		        String XMLfromBPMN = json.getString("bpmn20Xml");
		        String FlowID      = json.getString("id");
		        //create BPM with the model 
		        createFile(XMLfromBPMN);
		        //Reading BPM Model Instance from the file 
		        File file = new File("model.bpmn");        
		        //Prepare BPM Model from the file
		        BpmnModelInstance modelInstance = Bpmn.readModelFromFile(file);
		        //Setting up input and output
		        FlowNode source = modelInstance.getModelElementById(input1);
		        FlowNode target = modelInstance.getModelElementById(input2);    

		        System.out.println("The path from "+input1+" to "+input2+" is: \n "+ getFlowingFlowNodes(source,target).toString());
			}catch(Exception e) {
				System.exit(-1);
				return;
			}
    }
    //Get URL Request
    public static  JSONObject readJsonFromUrl() throws IOException, JSONException {
        InputStream is = new URL(URL).openStream();
     //BpmnModelInstance modelInstance = Bpmn.readModelFromStream(is);	
        try {
          BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
          String jsonText = readAll(rd);
          JSONObject json = new JSONObject(jsonText.replace("\n", " "));
         
          return json;
      
        } finally {
          is.close();
        }
      }
    
    //Read All JSON Guest
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
          sb.append((char) cp);
        }
        return sb.toString();
      }
    
    //Create a BPMN File
    public static void createFile(String str) 
    	throws IOException {    		
    		    BufferedWriter writer = new BufferedWriter(new FileWriter("model.bpmn"));
    		    writer.write(str);    		    
    		    writer.close();
    }
    //Collection Flow Node 
    public static Collection<String> getFlowingFlowNodes(FlowNode start, FlowNode target) {
    	Collection<String> visitedNode = new ArrayList<String>();
    	FlowNode currentNode=start; 
    	 visitedNode.add(currentNode.getId());
    	 while(!currentNode.getOutgoing().isEmpty() && currentNode!=target) {
    	  ArrayList<FlowNode> listToVisit = new ArrayList<FlowNode>();
	    	  for (SequenceFlow sequenceFlow : currentNode.getOutgoing()) {	    	        	    
		  		    currentNode=sequenceFlow.getTarget();
		  		    listToVisit.add(currentNode);
		      }
	    	  //return valid node
	    	  currentNode = getAuxFlowNodes(listToVisit,visitedNode,start,target);
	    	  visitedNode.add(currentNode.getId());
	 
    	}
    	return visitedNode;
    }
    
    private static FlowNode getAuxFlowNodes(ArrayList<FlowNode> flowNodesGateway, Collection<String> visitedNode,FlowNode start,FlowNode target) {
    	FlowNode validNode= null;
    	FlowNode currentNode= null;
    	
    	ArrayList<FlowNode> listToVisit = new ArrayList<FlowNode>();
    	ArrayList<Boolean> isValid = new ArrayList<Boolean>();
    	//For all the cases do
    	for(int i=0; i <flowNodesGateway.size();i++ ) {
    		//Set path as not valid
    		isValid.add(false); 
    		//Visit node 
    		currentNode = flowNodesGateway.get(i);
    		while(!currentNode.getOutgoing().isEmpty() && currentNode!=target) {
    			//Test if the node has more than 2 paths
	    		if(currentNode.getOutgoing().size()==1) {
	    			  //Update current Node
		   		      for (SequenceFlow sequenceFlow : currentNode.getOutgoing()) {	    	        	    
		   		    	  currentNode=null;
		   		    	  if(!visitedNode.contains(sequenceFlow.getTarget().getId())) {  
		   		    		  currentNode=sequenceFlow.getTarget();
		   		    	  }
		   		      }
	   	      	}else {
	   	      		  for (SequenceFlow sequenceFlow : currentNode.getOutgoing()) {	    	        	    
		   	   	      	  //Verify if the code has been visited
		   	      		  if(!visitedNode.contains(sequenceFlow.getTarget().getId())) {
		   	   	      		  listToVisit.add(sequenceFlow.getTarget());
		   	   	      	  }
	   	      		  }
	   	      		  currentNode = getAuxFlowNodes(listToVisit,visitedNode,start,target); 
	   	      	}
	    		if(currentNode== null) {break;}
    		}
    		//Set Valid node to return
    		if(currentNode == target) {validNode = flowNodesGateway.get(i);}
    	}
    	//If valid return is the node with the valid way  
    	return validNode;
    	
    }

}
