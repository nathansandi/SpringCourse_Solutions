package com.nathan.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nathan.flightreservation.entities.Reservation;
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
