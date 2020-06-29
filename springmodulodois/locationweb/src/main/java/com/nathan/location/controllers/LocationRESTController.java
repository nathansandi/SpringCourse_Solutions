package com.nathan.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathan.location.entities.Location;
import com.nathan.location.repos.LocationRepository;

@RestController

@RequestMapping("/locations")
public class LocationRESTController {
	
	@Autowired
	LocationRepository locationRep;
	
	@GetMapping
	public List<Location> getLocation(){		
		return locationRep.findAll();
	}
	
	@PostMapping
	public Location create(@RequestBody Location location){		
		return locationRep.save(location);
	}
	@PutMapping
	public Location update(@RequestBody Location location){		
		return locationRep.save(location);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id){		
		locationRep.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Location getOne(@PathVariable("id") int id){		
		return locationRep.findById(id).get();
	}

}
