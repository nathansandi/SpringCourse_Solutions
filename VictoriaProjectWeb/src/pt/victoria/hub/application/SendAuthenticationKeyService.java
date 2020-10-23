package pt.victoria.hub.application;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  org.json.JSONObject;

import pt.victoria.hub.Model.Common.Contact;
import pt.victoria.hub.Model.User.User;
import pt.victoria.hub.application.model.ApplicationCode;
import pt.victoria.hub.b2c.ScarService.LoginRequest;
import pt.victoria.hub.b2c.ScarService.LoginResponse;
import pt.victoria.hub.b2c.ScarService.ScarServiceProxy;
import pt.victoria.hub.b2c.ScarService.SendAuthenticationKeyRequest;
import pt.victoria.hub.b2c.ScarService.SendAuthenticationKeyResponse;
import pt.victoria.hub.b2c.ScarService.SignupAllowedRequest;
import pt.victoria.hub.b2c.ScarService.SignupAllowedResponse;

public class SendAuthenticationKeyService extends HttpServlet{

	
    /**
	 * {		
		  "user": {		
		    "username": "PT123456789",
		    "preferencialContact": {
		      "standard": false,
		      "contactType": "EMAIL",
		      "contactValue": "sample.email@victoria-seguros.pt"
		
		    }
		  }
		}
	 */
	private static final long serialVersionUID = 1L;


	public SendAuthenticationKeyService() {
	        super();
	}

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
 	
		PrintWriter out = response.getWriter();

		String responseString = JSONManagement.getJsonDefaultResult();
		
		
		// Get Request Parameters
		JSONObject requestParameters;
    	String vatNumber;
    	String applicationCode;
    	boolean standard;
    	String contactType;
    	String contractValue;
    	SendAuthenticationKeyRequest sendAuthenticationKeyRequest = new SendAuthenticationKeyRequest();
    	JSONObject newUser = new JSONObject();
    	JSONObject newpreferencialContact = new JSONObject();
    	
    	User user = new User();    	
    	Contact preferencialContact = new Contact();    
    	
    	ScarServiceProxy callVatService= new ScarServiceProxy();
		SendAuthenticationKeyResponse responseService = new SendAuthenticationKeyResponse();
		
		//*********************************
    	try {
			requestParameters = JSONManagement.getRequestParameters(request.getReader());
			try {
				newpreferencialContact = requestParameters.getJSONObject("user").getJSONObject("preferencialContact");
				newUser=requestParameters.getJSONObject("user");
			} catch (Exception e) {
				
			}
			ApplicationCode appCode = new ApplicationCode();
	    	String getAppCode = appCode.getApplicationCode();
	    	
			
			applicationCode = getAppCode;
			vatNumber = newUser.getString("username");
			standard = newpreferencialContact.getBoolean("standard");
			contactType = newpreferencialContact.getString("contactType");
			contractValue = newpreferencialContact.getString("contactValue");
			
			preferencialContact.setContactType(contactType);
			preferencialContact.setContactValue(contractValue);
			preferencialContact.setStandard(standard);
			
			//user.setPreferencialContact(preferencialContact);
			sendAuthenticationKeyRequest.setUser(user);
			sendAuthenticationKeyRequest.getUser().setVatNumber(vatNumber);
			sendAuthenticationKeyRequest.getUser().setPreferencialContact(preferencialContact);
			sendAuthenticationKeyRequest.setApplicationCode(applicationCode);
			

		} catch (Exception e) {
			responseString = JSONManagement.getJsonResult(-1, e.getMessage(), null);
			out.print(responseString);
			return;
		}
    	// Business Logic
	
		try {
			
			  sendAuthenticationKeyRequest.getUser().setUsername(vatNumber);
			  responseService=callVatService.sendAuthenticationKey(sendAuthenticationKeyRequest);
			  
			  JsonObject responseData = new JsonObject();			
			  JsonObject returnInfo = new JsonObject();
			  
			  returnInfo.addProperty("status", responseService.getReturnInfo().getStatus().getValue()); 
			  returnInfo.addProperty("code", responseService.getReturnInfo().getCode());
			  returnInfo.addProperty("message", responseService.getReturnInfo().getMessage());
			  returnInfo.addProperty("phase", responseService.getReturnInfo().getPhase().getValue());
			  // Create Inner JSON Object 
			  responseData.add("response", returnInfo);
			  responseString = responseData.toString();

			
		} catch (Exception e1) {
			System.out.println(e1);			 
		    JsonObject responseData = new JsonObject();		    
		    JsonObject returnInfo = new JsonObject();
			returnInfo.addProperty("status", responseService.getReturnInfo().getStatus().getValue()); 
		    returnInfo.addProperty("code", responseService.getReturnInfo().getCode());
			returnInfo.addProperty("message", responseService.getReturnInfo().getMessage());
		
			responseData.add("response", returnInfo);
		    // Create Inner JSON Object 
			responseString = responseData.toString();
			out.print(responseString);
			return;
		
		}
		out.print(responseString);

    }
    

}
