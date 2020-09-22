package com.nathan.needhelp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathan.needhelp.entities.Usuarios;
import com.nathan.needhelp.repos.RegistroRepos;
@RestController

@RequestMapping("/registrarUtilizador")
public class RegistroRESTController {
	
	@Autowired
	RegistroRepos registroRepos;
	
	
	@PostMapping
	public Usuarios registrarUtilizador(@RequestBody Usuarios usuarios){		
		return  registroRepos.save(usuarios);
	}		
	
}
