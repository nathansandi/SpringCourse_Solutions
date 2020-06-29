package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class); 
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		//call method to find the accounts 
		List<Account> theAccounts = null;//theAccountDAO.findAccounts();
		try {
			//add a boolean flag to simulate exception
			boolean tripWire = false;		
			//display the accounts
			theAccounts
				=theAccountDAO.findAccounts(tripWire);
		}catch(Exception exc){
			System.out.println("Exception_ "+ exc);
		}
		
		System.out.println("\n \n Main program: AfterThrowing Demo AP");
		System.out.println("------------------");
		System.out.println(theAccounts);
		System.out.println("\n");
		//close the spring context
		context.close();
		
	}

}
