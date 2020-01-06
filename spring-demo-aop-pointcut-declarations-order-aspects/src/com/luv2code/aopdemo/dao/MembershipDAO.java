package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public boolean addDB() {
		
		System.out.println(getClass()+" : DOING STUFF: ADDING A MEMBERSSHIP ACCOUNT 00 ");
		return true;
	}
	public void goToSleep(){
		System.out.println(getClass()+":  go to sleep");
}
}
