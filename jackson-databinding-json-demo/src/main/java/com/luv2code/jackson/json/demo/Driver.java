package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			
			//create object mapp
			ObjectMapper mapper = new ObjectMapper();
			
			
			//read json file and map/convert to Java Pojo 
			//data/sample-lite.json
			Student theStudent = 
					mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print first name and last name
			System.out.println("First Name - " +theStudent.getFirstName());
			System.out.println("Last Name - " +theStudent.getLastName());
			
			Address tempAddress = theStudent.getAddress();
			
			System.out.println("Street - " +tempAddress.getStreet());
			
			for(String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
