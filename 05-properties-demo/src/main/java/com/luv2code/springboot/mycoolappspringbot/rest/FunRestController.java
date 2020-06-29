package com.luv2code.springboot.mycoolappspringbot.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	// expose / that return helloworld
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	
	@GetMapping("/teaminfo")
	public String expose() {
		
		return "Hello, the team coach is  " + coachName + " of team " +teamName;
	}
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello, the time is " + LocalDateTime.now();
	}
	
	@GetMapping("/bye")
	public String sayBye() {
		
		return "Bye";
	}
}
