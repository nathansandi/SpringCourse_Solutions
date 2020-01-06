package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalysticsAspect {

	@Before("com.luv2code.aopdemo.aspect.LucAopExpressions.forDaoPackNoGetterSetter()") //reuse
	public void performAddAccountAdvice() {
		System.out.println("\n======>>>> Performing API t ");
	}
}
