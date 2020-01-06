package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggincAspect {
	

	//going work for any parameters so will be executed twice
	@Before("com.luv2code.aopdemo.aspect.LucAopExpressions.forDaoPackNoGetterSetter()") //second parameter mnatch on any number of arguments
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>>> Executing @Before statment ");
	}
	

	

}
