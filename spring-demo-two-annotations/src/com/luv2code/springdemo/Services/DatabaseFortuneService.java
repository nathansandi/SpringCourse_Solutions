package com.luv2code.springdemo.Services;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;
@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "XXX Database Fortune Service XXX";
	}

}
