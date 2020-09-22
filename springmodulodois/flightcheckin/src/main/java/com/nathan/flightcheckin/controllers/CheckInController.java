package com.nathan.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nathan.flightcheckin.dto.ReservationUpdateRequest;
import com.nathan.flightcheckin.entities.Reservation;
import com.nathan.flightcheckin.integration.ReservationRESTClient;

@Controller
public class CheckInController {
	
	@Autowired
	ReservationRESTClient restClient;
	@RequestMapping("/showStartCheckIn")
	public String showStartCheckIn() {
		return "startCheckIn";
		
	}

	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		
		Reservation res = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation",res);
		return "displayReservationDetails";
		
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId, @RequestParam("numberOfBags") int numberOfBags) {
		
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(reservationId);
		request.setCheckedIn(true);
		request.setNumberOfBags(numberOfBags);
		restClient.updateReservation(request);
		return "checkInConfirmation";
		
	}
}
