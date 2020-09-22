package com.nathan.needhelp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathan.needhelp.entities.Usuarios;

public interface RegistroRepos extends JpaRepository<Usuarios, String> {
		//Users registrarNovoUsuario(ReservationRequest request)
}
