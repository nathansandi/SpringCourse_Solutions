package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	@AfterThrowing(pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
					throwing="theExc")
	public void afterThrowingAdvice(JoinPoint theJoinPoint, Throwable theExc) {
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n ===>> Exectuting After Throwing method:"+method);
		
		//log the exception
		System.out.println("\n ===>> Excp is :"+theExc);
		
	}
	
	//add a new advice for @AfterReturning
	@AfterReturning(
			pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))"
			,returning="result")
	public void afterReturningAccountsAdvice(JoinPoint theJoinPoint, List<Account> result){
		//print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n ===>> Exectuting After returning method:"+method);
		//print out the results of the method call
		System.out.println("\n ===>> Results is:"+result);
		
		//lets post process the data...
		//modify the data 
		
		//convert the account names to uppercase
		convertAccountNamesToUpperCase(result);
		System.out.println("\n ===>> New Results is:"+result);
		
	}
	
	
	private void convertAccountNamesToUpperCase(List<Account> result) {
		// loop
		for(Account tempAccount:result){
			//get upercase
			String theUpperCase = tempAccount.getName().toUpperCase();
			//update name
			tempAccount.setName(theUpperCase);
			
		}
	}


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
