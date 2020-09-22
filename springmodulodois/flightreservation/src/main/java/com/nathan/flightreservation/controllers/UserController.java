package com.nathan.flightreservation.controllers;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nathan.flightreservation.entities.User;
import com.nathan.flightreservation.repos.UserRepository;
import com.nathan.flightreservation.services.SecurityService;

@Controller
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	UserRepository userRepository;
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		LOGGER.info("Inside showRegistrationPage");
		return "login/registerUser";
	}
	@RequestMapping("/home")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/loginP")
	public String showLogin() {
		LOGGER.info("Inside show login page ");
		return "login/login";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		LOGGER.info("Inside reigster  "+user);
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
		return "login/login";
	}
	//tentar amanter o  memso nome 
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("email") String login, @RequestParam("password") String password, ModelMap modelMap) {
		//Coloca no repos e spring busca automatico

		LOGGER.info("inside login and email is "+login);

		
		boolean login2 = securityService.login(login, password);
		
		if(login2) {
			return "findFlights";
		}
		else {
			modelMap.addAttribute("msg","Login inválido.");
			
		}
		return "login/login";
		
		
		
	}
}
