package pt.victoria.hub.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

import com.google.gson.JsonObject;

import pt.victoria.hub.Model.Client.Client;
import pt.victoria.hub.application.model.ApplicationCode;
import pt.victoria.hub.b2c.SmcService.GetClientDetailRequest;
import pt.victoria.hub.b2c.SmcService.GetClientDetailResponse;
import pt.victoria.hub.b2c.SmcService.GetClientsRequest;
import pt.victoria.hub.b2c.SmcService.GetClientsResponse;
import pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse;
import pt.victoria.hub.b2c.SmcService.GetPreferencialContactsRequest;
import pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse;
import pt.victoria.hub.b2c.SmcService.SmcServiceProxy;

public class GetClientDetailService extends HttpServlet{
	private static final long serialVersionUID = 1L;
    



	public GetClientDetailService() {
	        super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		
		ApplicationCode appCode = new ApplicationCode();
    	String getAppCode = appCode.getApplicationCode();
    	
		String applicationCode = getAppCode;
		String vatNumber = "";
		
		Client client = new Client();
		
		SmcServiceProxy service =new SmcServiceProxy();
		GetClientDetailRequest requestService = new GetClientDetailRequest();
		GetClientDetailResponse responseService = new GetClientDetailResponse();
		
		JSONObject requestParameters;
		String responseString;
		PrintWriter out = response.getWriter();
		try {
			requestParameters = JSONManagement.getRequestParameters(request.getReader());
			vatNumber = requestParameters.getString("vatNumber");
			client.setVatNumber(vatNumber);
			requestService.setClient(client);
			requestService.getClient().setVatNumber(vatNumber);
			requestService.setApplicationCode(applicationCode);

		} catch (Exception e) {
			responseString = JSONManagement.getJsonResult(-1, e.getMessage(), null);
			out.print(responseString);
			return;
		}
		// Send Request to HUB
		try {

				responseService  = service.getClientDetail(requestService);		
				JSONObject jsonOutput = new JSONObject();
				JSONObject jsonOutputReturn = new JSONObject();
				jsonOutputReturn.put("status", responseService.getReturnInfo().getStatus().getValue()); 
				jsonOutputReturn.put("code", responseService.getReturnInfo().getCode());
				jsonOutputReturn.put("message", responseService.getReturnInfo().getMessage());
				jsonOutputReturn.put("phase", responseService.getReturnInfo().getPhase().getValue());
				 // Create Inner JSON Object 
				jsonOutput.put("response",jsonOutputReturn);
				
				if (responseService.getClient() != null) {
						jsonOutput.put("clientDetail", responseService.getClient());
				}
				
				responseString = jsonOutput.toString();
			
		} catch (Exception e) {

			JsonObject responseData = new JsonObject();
			    
			JsonObject returnInfo = new JsonObject();
			returnInfo.addProperty("status", responseService.getReturnInfo().getStatus().getValue()); 
		    returnInfo.addProperty("code", responseService.getReturnInfo().getCode());
			returnInfo.addProperty("message", responseService.getReturnInfo().getMessage());
			responseData.add("response", returnInfo);
			out.print(responseData);
			return;
		}
		out.print(responseString);
	}

}
