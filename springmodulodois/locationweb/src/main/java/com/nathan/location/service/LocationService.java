package com.nathan.location.service;
import java.util.List;

import com.nathan.location.entities.Location;
public interface LocationService {
	//host the methods
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationbyId(int id);
	List<Location> getAllLocations();
}
