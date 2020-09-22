package com.nathan.flightreservation.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nathan.flightreservation.controllers.ReservationController;
import com.nathan.flightreservation.dbo.ReservationRequest;
import com.nathan.flightreservation.entities.Flight;
import com.nathan.flightreservation.entities.Passenger;
import com.nathan.flightreservation.entities.Reservation;
import com.nathan.flightreservation.repos.FlightRepository;
import com.nathan.flightreservation.repos.PassengerRepository;
import com.nathan.flightreservation.repos.ReservationRepository;
import com.nathan.flightreservation.util.EmailUtil;
import com.nathan.flightreservation.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Value("${com.nsandi.flightreservation.itinerary.dirpath}")
	private String C_USERS_NSAND_RE;

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRep;
	
	@Autowired
	PDFGenerator pdfGen;
	
	@Autowired
	EmailUtil emaiUtil;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationServiceImpl.class);
	
	
	@Override
	@Transactional //ACID in Database
	public Reservation bookFlight(ReservationRequest request) {
		
		LOGGER.info("Inside bookflight");
		//Make Payment
		Long flightId= request.getFlightId();
		LOGGER.info("fetching bookflight for id> "+flightId);
		Flight flight= flightRepository.findById(flightId).get();
		
		//save passenger
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		
		Passenger passengerSaved = passengerRepository.save(passenger);
		LOGGER.info("Saving pass."+passenger);
		//reservation
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passengerSaved);
		reservation.setCheckedIn(false);
		reservationRep.save(reservation);
		LOGGER.info("Saving Reservation."+reservation);
		
		String filePath = C_USERS_NSAND_RE+reservation.getId()+".pdf";
		LOGGER.info("Generating Itinerary");
		pdfGen.generateItinerary(reservation, filePath);
		emaiUtil.sendItinerary(passenger.getEmail(), filePath);
		// TODO Auto-generated method stub
		return reservation;
	}

}
