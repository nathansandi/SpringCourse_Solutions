package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneServices;
import com.luv2code.springdemo.interfaces.RandomicFortuneService;

public class TrackCoach implements Coach {

	private RandomicFortuneService fortuneService;
	private FortuneServices fortuneService2;
	
    @Value("${foo.email}")
    private String email;
        
    @Value("${foo.team}")
    private String team;
    
	public TrackCoach() {
		
	}
	
	

	public TrackCoach(RandomicFortuneService fortuneService, FortuneServices fortuneService2) {
		super();
		this.fortuneService = fortuneService;
		this.fortuneService2 = fortuneService2;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getRandomicFortune() {
		// TODO Auto-generated method stub
		return "just  do it "+fortuneService.getRandomicFortune();
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//add init method
	public void doMyStartupStuf(){
		// TODO Auto-generated method stub
		System.out.println("Trackcoach starts \n");
	}
	//add destroy method
	public void doMyCleanupStuf(){
		// TODO Auto-generated method stub
		System.out.println("Trackcoach ends \n");
	}



}
