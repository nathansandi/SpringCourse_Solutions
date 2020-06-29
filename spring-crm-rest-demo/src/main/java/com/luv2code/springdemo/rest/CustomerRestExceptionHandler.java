package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.luv2code.springdemo.rest.CustomErrorResponse;
@ControllerAdvice
public class CustomerRestExceptionHandler {
	//Global exception Handler
	//add an exception handler for customer not found
	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleException(CustomerNotFoundException exc){
		
		//create customer error response
		
		CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(),exc.getMessage(),
											System.currentTimeMillis());
		//return response Entity
		
		return new ResponseEntity<CustomErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
	
	
	//add another exception handler for global exceptions	
	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleException(Exception exc){
		
		//create customer error response
		
		CustomErrorResponse error = new CustomErrorResponse(HttpStatus.BAD_REQUEST.value(),exc.getMessage(),
											System.currentTimeMillis());
		//return response Entity
		
		return new ResponseEntity<CustomErrorResponse>(error,HttpStatus.BAD_REQUEST);
	}
}
