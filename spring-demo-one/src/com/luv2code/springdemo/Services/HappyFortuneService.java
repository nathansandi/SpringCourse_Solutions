package com.luv2code.springdemo.Services;

import com.luv2code.springdemo.interfaces.FortuneServices;

public class HappyFortuneService implements FortuneServices {

	public String getFortune(){
		
		return "Today is your lucky day";
	}	


}
