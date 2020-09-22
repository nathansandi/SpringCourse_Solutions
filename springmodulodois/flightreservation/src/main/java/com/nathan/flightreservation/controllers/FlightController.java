package com.nathan.flightreservation.controllers;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nathan.flightreservation.repos.FlightRepository;
import com.nathan.flightreservation.entities.*;

@Controller
public class FlightController {

	private static final Logger LOGGER = LoggerFactory.getLogger(FlightController.class);
	
	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("date") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
			ModelMap modelmap) {
		
		LOGGER.info("Inside findFlight "+from+" to "+to);
		
		List<Flight> flights= flightRepository.findFlights(from,to,departureDate);
		modelmap.addAttribute("flights", flights);
		LOGGER.info("Flights found are "+flights);
		
		return "displayFlights";
	}
	
	
	@RequestMapping("admin/showAddFlight")
	public String showAddFlight() {
		return "admin/addFlight";
	}
	
}
