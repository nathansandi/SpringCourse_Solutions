package com.luv2code.springdemo.Services;

import com.luv2code.springdemo.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is a sad day";
	}

}
