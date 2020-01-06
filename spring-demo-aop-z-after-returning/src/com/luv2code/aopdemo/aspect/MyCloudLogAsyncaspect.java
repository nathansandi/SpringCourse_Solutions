package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1) //lower number has more priority
public class MyCloudLogAsyncaspect {
	@Before("com.luv2code.aopdemo.aspect.LucAopExpressions.forDaoPackNoGetterSetter()") //reuse
	public void logToCludAsync() {
		System.out.println("\n======>>>> Logging to cloud imn async fashion ");
	}
}
