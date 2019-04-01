package com.luv2code.springdemo.Services;

import java.util.ArrayList;

import com.luv2code.springdemo.interfaces.RandomicFortuneService;

public class HappyFortuneRandomicService implements RandomicFortuneService{

	public String getRandomicFortune() {
		ArrayList<String> test= new ArrayList<String>();
		test.add("Hello this fortune is one");
		test.add("Hello this fortune is two");
		test.add("Hello this fortune is three");
		int index = (int) (Math.random()*3);
		// TODO Auto-generated method stub
		return test.get(index);
	}

}
