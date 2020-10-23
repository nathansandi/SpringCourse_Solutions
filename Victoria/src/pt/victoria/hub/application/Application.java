package pt.victoria.hub.application;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import pt.victoria.hub.Model.User.User;
import pt.victoria.hub.b2c.ScarService.LoginRequest;
import pt.victoria.hub.b2c.ScarService.LoginResponse;
import pt.victoria.hub.b2c.ScarService.ScarServiceProxy;

@WebServlet("/anonymous/login")
public class Application extends HttpServlet{

	
    public Application() {
	        super();
	}

    
    protected void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
 	
		PrintWriter out = response.getWriter();

		String responseString = JSONManagement.getJsonDefaultResult();

		
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
			ScarServiceProxy callLogin= new ScarServiceProxy();
			LoginResponse loginResponse = new LoginResponse();
			loginResponse=callLogin.login(loginRequest);
			Gson convertToString = new Gson();
			
			responseString = JSONManagement.getJsonResult(0, convertToString.toJson(loginResponse), null);
			
		} catch (Exception e1) {
			System.out.println(e1);
			responseString = JSONManagement.getJsonResult(-1, e1.getMessage(), null);
			out.print(responseString);
			return;
		}
		out.print(responseString);

    }
    

}
