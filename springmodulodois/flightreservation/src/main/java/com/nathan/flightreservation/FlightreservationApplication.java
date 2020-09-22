package com.nathan.flightreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//+ara war extends SpringBooptServletInitializer
@SpringBootApplication
public class FlightreservationApplication {
	//config
	
	// return builder.sourceS(FlightReservationApplication.class)
	public static void main(String[] args) {
		SpringApplication.run(FlightreservationApplication.class, args);
	}

}
