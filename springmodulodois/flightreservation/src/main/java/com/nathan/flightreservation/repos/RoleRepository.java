package com.nathan.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathan.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
