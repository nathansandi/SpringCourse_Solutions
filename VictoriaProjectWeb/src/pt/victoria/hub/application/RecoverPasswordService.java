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
import pt.victoria.hub.b2c.ScarService.RecoverPasswordRequest;
import pt.victoria.hub.b2c.ScarService.RecoverPasswordResponse;
import pt.victoria.hub.b2c.ScarService.ScarServiceProxy;

public class RecoverPasswordService extends HttpServlet{

	
    /**
	 * username
	 */
	private static final long serialVersionUID = 1L;


	public RecoverPasswordService() {
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
		RecoverPasswordResponse responseRec = new RecoverPasswordResponse();
		// Get Request Parameters
		JSONObject requestParameters;
    	String usuario;
    	String password;
    	RecoverPasswordRequest recoverRequest = new RecoverPasswordRequest();
    	User newUser = new User();
    	try {
			requestParameters = JSONManagement.getRequestParameters(request.getReader());
			usuario = requestParameters.getString("username");
			recoverRequest.setApplicationCode(getAppCode);
			recoverRequest.setVatNumber(usuario);
		

		} catch (Exception e) {
			responseString = JSONManagement.getJsonResult(-1, e.getMessage(), null);
			out.print(responseString);
			return;
		}
    	// Business Logic
	
		try {

			responseRec=callLogin.recoverPassword(recoverRequest);

		    JsonObject responseData = new JsonObject();
		    
		    JsonObject returnInfo = new JsonObject();
			returnInfo.addProperty("status", responseRec.getReturnInfo().getStatus().getValue()); 
			returnInfo.addProperty("code", responseRec.getReturnInfo().getCode());
			returnInfo.addProperty("message", responseRec.getReturnInfo().getMessage());
			returnInfo.addProperty("phase", responseRec.getReturnInfo().getPhase().getValue());
		    // Create Inner JSON Object 
		    responseData.add("response", returnInfo);		  
			responseString = responseData.toString();
			
		} catch (Exception e1) {
			System.out.println(e1);
		    
		    JsonObject responseData = new JsonObject();
		    
		    JsonObject returnInfo = new JsonObject();
			returnInfo.addProperty("status", responseRec.getReturnInfo().getStatus().getValue()); 
			returnInfo.addProperty("code", responseRec.getReturnInfo().getCode());
			returnInfo.addProperty("message", responseRec.getReturnInfo().getMessage());
		    // Create Inner JSON Object 
			responseData.add("response", returnInfo);
			responseString = responseData.toString();
			out.print(responseString);
			return;
		}
		out.print(responseString);

    }
    

}
