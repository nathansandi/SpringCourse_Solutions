package com.luv2code.springdemo;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneServices;

public class BaseballCoach implements Coach {
	
	private FortuneServices fortuneService;
	//Construtor
	public BaseballCoach(FortuneServices theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout()  {
		return "Spend 30 minutes on batting pactice";
	}
	@Override
	public String getRandomicFortune() {
		//use my fortune service to recoveru
		
		return fortuneService.getFortune();
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}


}
