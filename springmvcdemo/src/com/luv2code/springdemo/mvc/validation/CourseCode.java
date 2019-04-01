package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeContraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD}) //aplica em metodos e campos
@Retention(RetentionPolicy.RUNTIME) //Retain this notation in class and also use in runtime
public @interface CourseCode {
	//Define default course code
	public String[] value() default {"LUV","ASD"};
	
	//Define default error code
	public String message() default "msut start with LUV";
	
	//define default groups
	public Class<?>[] groups() default{};	
	
	//define default payload
	public Class<? extends Payload>[] payload() default{};
}
