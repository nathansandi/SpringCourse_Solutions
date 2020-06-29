package com.nathan.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathan.location.entities.Location;
import com.nathan.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);

	}

	@Override
	public Location getLocationbyId(int id) {
		// TODO Auto-generated method stub
		Location retorno = new Location();
		retorno = repository.findById(id).get();
		return retorno;
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return  repository.findAll();
	}

}
