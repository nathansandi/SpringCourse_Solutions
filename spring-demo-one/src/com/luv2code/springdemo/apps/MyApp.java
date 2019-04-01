package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.TrackCoach;
import com.luv2code.springdemo.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the object
		Coach theCoach = new TrackCoach();
		
		//use the objsect
		System.out.println(theCoach.getDailyWorkout());
	}

}
