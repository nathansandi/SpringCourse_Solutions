package com.luv2code.springdemo.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.SwimCoach;
import com.luv2code.springdemo.interfaces.Coach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		//retrieve bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("\nEmail: "+ theCoach.getEmail() + "\n Team : " +theCoach.getTeam() );
		context.close();

	}

}
