package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		Coach alphacoach = context.getBean("myCoach", Coach.class);
		
		Coach thecoach1 = context.getBean("myCoach1", Coach.class);
		
		Coach alphacoach1 = context.getBean("myCoach1", Coach.class);
		
		
		//singleton - recovery the same reference 
		//check if they are the same bean
		boolean result = (thecoach == alphacoach);
		//print my results
		System.out.println("\npointing to the same object: "+result);
		System.out.println("\nMemory  location for thecoach: "+ thecoach);
		System.out.println("\nMemory  location for alphacoach: "+ alphacoach);
		
		//singleton - recovery the same reference 
		//check if they are the same bean
		boolean result1 = (thecoach1 == alphacoach1);
		//print my results
		System.out.println("\npointing to the same object: "+result1);
		System.out.println("\nMemory  location for thecoach: "+ thecoach1);
		System.out.println("\nMemory  location for alphacoach: "+ alphacoach1);
		
		
		//close
		context.close();
		
	}

}
