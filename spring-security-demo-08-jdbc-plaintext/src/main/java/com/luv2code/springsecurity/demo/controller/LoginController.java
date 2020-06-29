package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		return "fancy-login";
	}
	
	//Add a request for accccess denied 
	@GetMapping("/access-denied")
	public String showMyAccessDeniedPage() {
		return "access-denied";
	}
}
