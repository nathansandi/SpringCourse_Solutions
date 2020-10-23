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

import pt.victoria.hub.Model.User.User;
import pt.victoria.hub.application.model.ApplicationCode;
import pt.victoria.hub.b2c.ScarService.LoginRequest;
import pt.victoria.hub.b2c.ScarService.LoginResponse;
import pt.victoria.hub.b2c.ScarService.ScarServiceProxy;
import pt.victoria.hub.b2c.ScarService.SignupAllowedRequest;
import pt.victoria.hub.b2c.ScarService.SignupAllowedResponse;

public class SignupAllowedService extends HttpServlet{

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public SignupAllowedService() {
	        super();
	}

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       	ApplicationCode appCode = new ApplicationCode();
    	String getAppCode = appCode.getApplicationCode();
    	
    	request.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
 	
		PrintWriter out = response.getWriter();

		String responseString = JSONManagement.getJsonDefaultResult();
		
		
		// Get Request Parameters
		JSONObject requestParameters;
    	String vatNumber;
    	String webUser;
    	String applicationCode;
    	SignupAllowedRequest signupAllowed = new SignupAllowedRequest();
		ScarServiceProxy callVatService= new ScarServiceProxy();
		SignupAllowedResponse responseService = new SignupAllowedResponse();
    	User newUser = new User();
    	try {
			requestParameters = JSONManagement.getRequestParameters(request.getReader());
			vatNumber = requestParameters.getString("username");
			
			applicationCode = getAppCode;
			signupAllowed.setVatNumber(vatNumber);
			//signupAllowed.setWebUser(webUser);
			signupAllowed.setApplicationCode(applicationCode);

		} catch (Exception e) {
			responseString = JSONManagement.getJsonResult(-1, e.getMessage(), null);
			out.print(responseString);
			return;
		}
    	// Business Logic
	
		try {

			responseService=callVatService.signupAllowed(signupAllowed);					    
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
		    // Create Inner JSON Object 
			responseData.add("response", returnInfo);
			responseString = responseData.toString();
			out.print(responseString);
	
			return;
	
		}
		out.print(responseString);

    }
    

}
