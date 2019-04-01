package com.luv2code.springdemo;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneServices;
import com.luv2code.springdemo.interfaces.RandomicFortuneService;

public class SoccerCoach implements Coach{

	
	

		private RandomicFortuneService fortuneService;
		private FortuneServices fortuneService2;
	
		public SoccerCoach(RandomicFortuneService fortuneService, FortuneServices fortuneService2) {
			super();
			this.fortuneService = fortuneService;
			this.fortuneService2 = fortuneService2;
		}


		@Override	
		public String getDailyWorkout(){
			return "Train soccer 10 times per day!";
		}

		@Override
		public String getRandomicFortune() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getDailyFortune() {
			// TODO Auto-generated method stub
			return null;
		}




}
