package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggincAspect {
	

	//going work for any parameters so will be executed twice
	@Before("com.luv2code.aopdemo.aspect.LucAopExpressions.forDaoPackNoGetterSetter()") //second parameter mnatch on any number of arguments
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n======>>>> Executing @Before statment advice on method ");
		
		//display the method signature
		MethodSignature methoSig = (MethodSignature) theJoinPoint.getSignature();
		
		
		//display the method argumetns
		System.out.println("Method:" +methoSig);
		
		//get arg
		Object[] args = theJoinPoint.getArgs();
		
		
		//loop thru the ars
		for(Object tempArg:args) {
			System.out.println(tempArg);
			if(tempArg instanceof Account) {
				//downcast and print account specific stuff 
				Account theAccount = (Account) tempArg;
				System.out.println("account name:"  +theAccount.getName());
				
				System.out.println("account level:"  +theAccount.getLevel());
			}
		}
	}
	

	

}
