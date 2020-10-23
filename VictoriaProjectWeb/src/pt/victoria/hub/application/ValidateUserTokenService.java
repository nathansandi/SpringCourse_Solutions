package pt.victoria.hub.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

import com.google.gson.JsonObject;

import pt.victoria.hub.Model.User.User;
import pt.victoria.hub.application.model.ApplicationCode;
import pt.victoria.hub.b2c.ScarService.ScarServiceProxy;
import pt.victoria.hub.b2c.ScarService.ValidateUserTokenRequest;
import pt.victoria.hub.b2c.ScarService.ValidateUserTokenResponse;
import pt.victoria.hub.b2c.SmcService.GetPreferencialContactsRequest;
import pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse;
import pt.victoria.hub.b2c.SmcService.SmcServiceProxy;

public class ValidateUserTokenService extends HttpServlet{
	private static final long serialVersionUID = 1L;
    
	
    //username
	//tokenKey

	public ValidateUserTokenService() {
	        super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		
		ApplicationCode appCode = new ApplicationCode();
    	String getAppCode = appCode.getApplicationCode();
    	
		String applicationCode = getAppCode;
		String vatNumber = "";
		String token  = "";
		User user = new User();
		
		ScarServiceProxy service =new ScarServiceProxy();
		ValidateUserTokenRequest validateUserTokenRequest = new ValidateUserTokenRequest();
		ValidateUserTokenResponse validateUserTokenResponse = new ValidateUserTokenResponse();
		
		JSONObject requestParameters;
		String responseString;
		PrintWriter out = response.getWriter();
		try {
			requestParameters = JSONManagement.getRequestParameters(request.getReader());			
			//JSONObject newUser=requestParameters.getJSONObject("user");						
			vatNumber = requestParameters.getString("username");
			token  = requestParameters.getString("tokenKey");			
			user.setUsername(vatNumber);			
			validateUserTokenRequest.setApplicationCode(applicationCode);
			validateUserTokenRequest.setUser(user);
			
			validateUserTokenRequest.setTokenKey(token);

		} catch (Exception e) {
			responseString = JSONManagement.getJsonResult(-1, e.getMessage(), null);
			out.print(responseString);
			return;
		}
		// Send Request to HUB
		try {
			validateUserTokenResponse  = service.validateUserToken(validateUserTokenRequest);
			JSONObject jsonOutput = new JSONObject();
			JSONObject jsonOutputReturn = new JSONObject();
			jsonOutputReturn.put("status", validateUserTokenResponse.getReturnInfo().getStatus().getValue()); 
			jsonOutputReturn.put("code", validateUserTokenResponse.getReturnInfo().getCode());
			jsonOutputReturn.put("message", validateUserTokenResponse.getReturnInfo().getMessage());
			jsonOutputReturn.put("phase", validateUserTokenResponse.getReturnInfo().getPhase().getValue());
			 // Create Inner JSON Object 
			jsonOutput.put("response",jsonOutputReturn);
			if (validateUserTokenResponse.getUser() != null) {
					jsonOutput.put("user", validateUserTokenResponse.getUser());
			}
			responseString = jsonOutput.toString();
			
		} catch (Exception e) {
					
			JsonObject responseData = new JsonObject();
			JsonObject returnInfo = new JsonObject();
			returnInfo.addProperty("status", validateUserTokenResponse.getReturnInfo().getStatus().getValue()); 
		    returnInfo.addProperty("code", validateUserTokenResponse.getReturnInfo().getCode());
			returnInfo.addProperty("message", validateUserTokenResponse.getReturnInfo().getMessage());
			    // Create Inner JSON Object 
			responseData.add("response", returnInfo);
			out.print(responseData);
			return;
		}

		// Set Json Response
		out.print(responseString);
	}

}
