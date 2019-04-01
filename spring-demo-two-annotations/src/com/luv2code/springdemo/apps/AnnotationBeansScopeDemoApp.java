package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class AnnotationBeansScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tenisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tenisCoach",Coach.class);
		
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object; " +result); 
		System.out.println("\nMemory the Coach  theCoach: ; " +theCoach); 
		//System.out.println("\nMemory location the Coach : ; " +theCoach); 
		System.out.println("\nMemory location for alpha : ; " +alphaCoach + "\n"); 
		
		context.close();

	}

}
