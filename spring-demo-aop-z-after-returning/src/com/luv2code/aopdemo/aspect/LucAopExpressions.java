package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LucAopExpressions {
	//@Before("execution(* add*(com.luv2code.aopdemo.Account,..))") //second parameter mnatch on any number of arguments
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}	
	//create pointcut for getter methods
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void  getter(){}
	//create pointcut for setter methods 
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setter() {}
	//create point: include ..exclude getter*setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackNoGetterSetter() {}
	
	
	
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

}
