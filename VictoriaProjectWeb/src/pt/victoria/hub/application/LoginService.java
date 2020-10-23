package pt.victoria.hub.application;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import  org.json.JSONObject;

import pt.victoria.hub.Model.User.User;
import pt.victoria.hub.application.model.ApplicationCode;
import pt.victoria.hub.b2c.ScarService.LoginRequest;
import pt.victoria.hub.b2c.ScarService.LoginResponse;
import pt.victoria.hub.b2c.ScarService.ScarServiceProxy;

public class LoginService extends HttpServlet{

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public LoginService() {
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

		ScarServiceProxy callLogin= new ScarServiceProxy();
		LoginResponse loginResponse = new LoginResponse();
		// Get Request Parameters
		JSONObject requestParameters;
    	String usuario;
    	String password;
    	LoginRequest loginRequest = new LoginRequest();
    	User newUser = new User();
    	try {
			requestParameters = JSONManagement.getRequestParameters(request.getReader());
			usuario = requestParameters.getString("username");
			password = requestParameters.getString("password");
			loginRequest.setApplicationCode(getAppCode);
			newUser.setUsername(usuario);
			loginRequest.setUser(newUser);
			loginRequest.setPassword(password);

		} catch (Exception e) {
			responseString = JSONManagement.getJsonResult(-1, e.getMessage(), null);
			out.print(responseString);
			return;
		}
    	// Business Logic
	
		try {

			loginResponse=callLogin.login(loginRequest);

		    JsonObject responseData = new JsonObject();
		    
		    JsonObject returnInfo = new JsonObject();
			returnInfo.addProperty("status", loginResponse.getReturnInfo().getStatus().getValue()); 
			returnInfo.addProperty("code", loginResponse.getReturnInfo().getCode());
			returnInfo.addProperty("message", loginResponse.getReturnInfo().getMessage());
			returnInfo.addProperty("phase", loginResponse.getReturnInfo().getPhase().getValue());
		    // Create Inner JSON Object 
		    responseData.add("response", returnInfo);
		    responseData.addProperty("token", loginResponse.getToken());		  
			responseString = responseData.toString();
			
		} catch (Exception e1) {
			System.out.println(e1);
		    
		    JsonObject responseData = new JsonObject();
		    
		    JsonObject returnInfo = new JsonObject();
			returnInfo.addProperty("status", loginResponse.getReturnInfo().getStatus().getValue()); 
			returnInfo.addProperty("code", loginResponse.getReturnInfo().getCode());
			returnInfo.addProperty("message", loginResponse.getReturnInfo().getMessage());
		    // Create Inner JSON Object 
			responseData.add("response", returnInfo);
			responseString = responseData.toString();
			out.print(responseString);
			return;
		}
		out.print(responseString);

    }
    

}
