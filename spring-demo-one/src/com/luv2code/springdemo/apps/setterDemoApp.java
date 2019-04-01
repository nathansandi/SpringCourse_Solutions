package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.CricketCoach;

public class setterDemoApp {

	public static void main(String[] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach  = context.getBean("myCricketCoach", CricketCoach.class);
	
		//calll methods on the bean
		//call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		//lets call our new method
		//System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailTeam());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();

	}

}
