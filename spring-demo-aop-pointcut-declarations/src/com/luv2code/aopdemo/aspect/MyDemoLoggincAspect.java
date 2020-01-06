package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggincAspect {
	
	//this is where we add all of our related advices fir logging
	
	//lets start with an @Before advice
	
	//Match addAccount method in any class -- -- will be apply before in any class
	//@Before("execution(public void addAccount())")
	//Breaking code:
	//@Before("execution(public void updateAccount())")
	//Macth with just only class
	//@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
	//Match method starting with "add" in any class
	//@Before("execution(public void add*())")
	//Match with any return type - modifier is optional
	//@Before("execution(* add*())")
	//
	//@Before("execution(* add*(com.luv2code.aopdemo.Account,..))") //second parameter mnatch on any number of arguments
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {
	}
	
	//going work for any parameters so will be executed twice
	@Before("forDaoPackage()") //second parameter mnatch on any number of arguments
	
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>>> Executing @Before statment ");
	}
	

	@Before("forDaoPackage()") //reuse
	
	public void performAddAccountAdvice() {
		System.out.println("\n======>>>> Executing @Before statment ");
	}
}
