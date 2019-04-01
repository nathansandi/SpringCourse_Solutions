package com.luv2code.springdemo;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneServices;

//Setter-Method lecture
public class CricketCoach implements Coach{
	private FortuneServices fortuneService;
	private String emailTeam;
	private String team;

	public void setEmailTeam(String emailTeam) {
		System.out.println("--*setEmailAddress*--");
		this.emailTeam = emailTeam;
	}

	public void setTeam(String team) {
		System.out.println("--*setTeam*--");		
		this.team = team;
	}
	public String getEmailTeam() {
		
		return emailTeam;
	}

	public String getTeam() {
		return  team;
	}

	//create no - arg constructor 
	public CricketCoach() {
		//System.out.println("arg construction");
	}
	
	public void setFortuneService(FortuneServices fortuneService) {
		//System.out.println("hey i am inside of setter method - setFS");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min/day";
	}

	@Override
	public String getRandomicFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}






}
