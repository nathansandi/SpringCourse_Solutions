package com.nathan.flightreservation.services;

import com.nathan.flightreservation.dbo.ReservationRequest;
import com.nathan.flightreservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);
}
