package pt.victoria.hub.application;


import java.io.BufferedReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class JSONManagement {

	public static String getJsonResult(Integer status, String message, JSONArray results) {
		JSONObject jsonOutput = new JSONObject();
		try {
			jsonOutput.put("Status", status);
			jsonOutput.put("Message", message);
			if (results != null) {
				jsonOutput.put("Results", results);
			}
		} catch (Exception e) {
		}
		
		return jsonOutput.toString();
	}
	
	public static String getJsonDefaultResult() {
		return "{Status: -1, Message: 'Ocorreu um erro não reconhecido'}";
	}
	
	public static JSONObject convertXMLResponsetoJSON(String xml, String element) throws Exception {	    
		// Parse Result to JSON
		JSONObject result = XML.toJSONObject(xml.toString()).getJSONObject("soap:Envelope").getJSONObject("soap:Body").getJSONObject(element);
		return result;
	}
	
	public static JSONObject getRequestParameters(BufferedReader reader) throws Exception {
		StringBuffer jb = new StringBuffer();
		String line = null;
	    while ((line = reader.readLine()) != null) {
	    	jb.append(line);
	    }
		JSONObject jsonObject = new JSONObject(jb.toString());
		return jsonObject;
	}
	
	public static String getSafeJSONString(JSONObject element, String key) {
		try {
			return element.getString(key);
		} catch (Exception e) {
			return "";
		}
	}
	
	public static Boolean getSafeJSONBoolean(JSONObject element, String key) {
		try {
			return element.getBoolean(key);
		} catch (Exception e) {
			return null;
		}
	}
	
}
