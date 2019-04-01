package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load my config xml file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		

		//retrieve bean from spring container
		Coach thecoach = context.getBean("myCoach", Coach.class);
		Coach myCoach1 = context.getBean("myCoach1", Coach.class);

		System.out.println(thecoach.getDailyWorkout());
		context.close();
	}

}
