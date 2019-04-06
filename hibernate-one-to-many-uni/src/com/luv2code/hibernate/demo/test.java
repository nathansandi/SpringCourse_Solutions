package com.luv2code.hibernate.demo;

import java.util.ArrayList;
import java.util.List;

public class test {
	private static int globalTime=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("chamando a funcao");
	    List<Integer> test = new ArrayList<Integer>();
	    test.add(8);
	    test.add(4);
	    test.add(6);
	    test.add(12);

	    int time = minimumTime(4,test);
	    
	    System.out.println("tempo é "+time);
		
	}
	
	public static int minimumTime(int numOfSubFiles, List<Integer> files)
	    {
	        // WRITE YOUR CODE HERE
		
	        int tempSum=0;
	        int tempIndex = 0;
	        int tempIndex2 = 0;
	        int i =0;

	        if(files.size() > 1){
	        	
	        	
	    	    System.out.println("inicia o loop");
	            for( i =0 ; i < files.size() ; i++ ) 
	            {
	            	
	                if(i != (files.size() -1)){
	                    if(i==0){
	                    	  tempSum = files.get(i)+ files.get(i+1);
	                           tempIndex = i;
	                           tempIndex2 = i+1;
	                    }else
	                    {
	                        if((files.get(i)+files.get(i+1)) < tempSum)
	                        {
	                            tempSum = files.get(i)+files.get(i+1);
	                            tempIndex = i;
	                            tempIndex2 = i+1; 
	                        }
	                    }
	                   
	                }
	            }
	            files.remove(tempIndex);
			    files.remove(tempIndex);
			    files.add(tempSum);
	        }
	        globalTime= globalTime+ tempSum;
	        if(files.size() > 1)
	        {
	        	return  minimumTime(numOfSubFiles-1, files);
	        }else {
	        	return globalTime;
	        }
		    

	    }
}
