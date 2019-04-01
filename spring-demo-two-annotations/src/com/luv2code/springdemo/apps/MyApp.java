package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.TenisCoach;
import com.luv2code.springdemo.TrackCoach;
import com.luv2code.springdemo.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//create the object with the name of my annotation
		TenisCoach theCoach = context.getBean("tenisCoach", TenisCoach.class);
		
	
		
		//use the objsect
		System.out.println(theCoach.getDailyWorkout());
		
		
		//call new method
		System.out.println(theCoach.getDailyFortune());
		//call new method
		System.out.println(theCoach.getEmail());
				
		
		
		
		//close the obkect
		context.close();
	}

}
