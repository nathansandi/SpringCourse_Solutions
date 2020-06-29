package com.nathan.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nathan.flightreservation.entities.User;
import com.nathan.flightreservation.repos.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		
		userRepository.save(user);
		return "login/login";
	}
	//tentar amanter o  memso nome 
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("email") String login, @RequestParam("password") String password, ModelMap modelMap) {
		//Coloca no repos e spring busca automatico
		User userS = userRepository.findByEmail(login);
		
		if(userS.getPassword().equals(password)) {
			return "findFlights";
		}
		else {
			modelMap.addAttribute("msg","Login inválido.");
			
		}
		return "login/login";
		
		
		
	}
}
