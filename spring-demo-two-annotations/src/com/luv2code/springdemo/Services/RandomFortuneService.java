package com.luv2code.springdemo.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;
@Component
public class RandomFortuneService implements FortuneService {
	ArrayList<String> test= new ArrayList<String>();

	@Override
	public String getFortune() {
		
		
		test.add("Hello this fortune is one");
		 test.add("Hello this fortune is two");
		test.add("Hello this fortune is three");
		int index = (int) (Math.random()*3);
		// TODO Auto-generated method stub
		return test.get(index);
	}

}
