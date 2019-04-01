package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.Coach;

@Component
public class TrackCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}




}
