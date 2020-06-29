package com.luv2code.springboot.mycoolappspringbot.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	// expose / that return helloworld
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello, the time is " + LocalDateTime.now();
	}
}
