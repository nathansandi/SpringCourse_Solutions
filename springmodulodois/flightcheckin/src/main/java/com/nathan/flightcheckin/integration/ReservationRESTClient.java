package com.nathan.flightcheckin.integration;

import com.nathan.flightcheckin.dto.ReservationUpdateRequest;
import com.nathan.flightcheckin.entities.Reservation;

public interface ReservationRESTClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
	
}
