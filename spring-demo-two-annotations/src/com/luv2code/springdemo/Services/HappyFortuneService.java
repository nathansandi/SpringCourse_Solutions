package com.luv2code.springdemo.Services;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "XXX Happy Fortune Service XXX";
	}

}
