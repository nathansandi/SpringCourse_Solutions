package com.luv2code.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component 
public class CRMLoggingAspect {
	
	//setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	//setup pointcut declaratiions
	
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("forDaoPackage() || forServicePackage() ||  forControllerPackage()")
	private void forAppFlow() {}
	
	//add before avice	
	
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		
		//display method we are calling
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("====== Before calling method :" + theMethod);
		
		//display the arguments
		
		//get the arguments
		Object[] args = theJoinPoint.getArgs();
		
		//loop thru and display arguments
		for(Object tempArgs: args) {
			myLogger.info("===>arg :" +tempArgs);
		}
		
	}	
	//add returning advice	
	
	@AfterReturning(
			pointcut="forAppFlow()",
			returning="theResult")
	public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
		//display method we are returning from

		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("====== After Returning  from method :" + theMethod);
		
		//display data return
		myLogger.info("====Result: " +theResult);
	}
	
	
}
