package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class getRandomicFortunePracticeApp {

	public static void main(String[] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class); //name of implementation
				
		//call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		//lets call our new method
		System.out.println(theCoach.getRandomicFortune());
		//close the context
		context.close();		

	}

}
