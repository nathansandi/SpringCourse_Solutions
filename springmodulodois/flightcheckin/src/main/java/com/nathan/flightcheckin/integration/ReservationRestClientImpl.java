package com.nathan.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nathan.flightcheckin.dto.ReservationUpdateRequest;
import com.nathan.flightcheckin.entities.Reservation;

@Component
public class ReservationRestClientImpl implements ReservationRESTClient {

	private static final String HTTP_LOCALHOST_8080_RESERVATIONS = "http://localhost:8080/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		// TODO Auto-generated method stub
		
		RestTemplate restTemplate = new RestTemplate();
		//rest and type of object
		Reservation reservation = restTemplate.
				getForObject("http://localhost:8080/reservation/"+id, Reservation.class);
		
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(HTTP_LOCALHOST_8080_RESERVATIONS, request, Reservation.class);
		// TODO Auto-generated method stub
		return reservation;
	}

}
