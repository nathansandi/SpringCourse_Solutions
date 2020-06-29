package com.nathan.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nathan.flightreservation.entities.Passenger;
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
