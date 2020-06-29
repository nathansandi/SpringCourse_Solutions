package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AfterArroundDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class); 
		
		//get the bean from spring container
		TrafficFortuneService theFortuneService 
			= context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		
		System.out.println("Main Program: Arroound demo app");
		
		System.out.println("Calling get");
		
		String dataR = theFortuneService.getFortune();
		
		
		System.out.println("My fortune is - "+dataR);
		
		System.out.println("Finished");
		//close the contxt
		context.close();
		
	}

}
