package com.nathan.flightreservation.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nathan.flightreservation.dbo.ReservationRequest;
import com.nathan.flightreservation.entities.Flight;
import com.nathan.flightreservation.entities.Reservation;
import com.nathan.flightreservation.repos.FlightRepository;
import com.nathan.flightreservation.services.ReservationService;

@Controller
public class ReservationController {
	
	

	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationController.class);
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationSer;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		LOGGER.info("esta no metodo showCompleteReservation com o id do voo " + flightId);
		
		Flight flight = flightRepository.findById(flightId).get();	
		
		modelMap.addAttribute("flight",flight);
		LOGGER.info("Flight is" + flight);
		
		return "completeReservation";
	}
	
	//exemplo insert 
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelmap) {
		LOGGER.info("complete reservation" + request);
		
		Reservation res = reservationSer.bookFlight(request);

		//Long id = res.getId();
		
		modelmap.addAttribute("msg","Reservation created successfuly and the id is "+res.getId());
		return "reservationConfirmation";
	}
	
		
		
}
