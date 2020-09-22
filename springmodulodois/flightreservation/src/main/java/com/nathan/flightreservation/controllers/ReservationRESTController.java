package com.nathan.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathan.flightreservation.dto.ReservationUpdateRequest;
import com.nathan.flightreservation.entities.Reservation;
import com.nathan.flightreservation.repos.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRESTController {
	
	@Autowired
	ReservationRepository res;
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		
		Reservation ress = res.findById(id).get();
		return ress;
		
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		Reservation reservation = res.findById(request.getId()).get();
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());

		return res.save(reservation);
		
	}
}
