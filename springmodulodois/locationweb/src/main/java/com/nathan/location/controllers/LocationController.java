package com.nathan.location.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nathan.location.entities.Location;
import com.nathan.location.repos.LocationRepository;
import com.nathan.location.service.LocationService;
import com.nathan.location.util.EmailUtil;
import com.nathan.location.util.ReportUtil;

import java.util.List;
import java.util.Objects;

import javax.servlet.ServletContext;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@Autowired
	LocationRepository location;
	
	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	ReportUtil reportUtil;
	
	
	@Autowired
	ServletContext context;
	
	@RequestMapping("/showcreate")
	public String showCreate()
	{
		return "createLocation";
	}
	@RequestMapping("/saveLoc")
	//class nao maiuscuklo
	public String saveLoc(@ModelAttribute("location") Location location, ModelMap modelMap)
	{
		Location loc = service.saveLocation(location);
		String msg = "Location saved with id: " + loc.getId();
		modelMap.addAttribute("msg",msg);
		emailUtil.sendEmail("nsandi7@icloud.com", "Teste", "Teste");
		return "createLocation";
		
	}
	@RequestMapping("/displayLoc")
	public String DisplayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,  ModelMap modelMap) {
		Location location = service.getLocationbyId(id);
		service.deleteLocation(location);
		//update data from database
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	@RequestMapping("/updateLocation")
	public String shouUpdatePage(@RequestParam("id") int id,  ModelMap modelMap)
	{
		Location location = service.getLocationbyId(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}
	
	@RequestMapping("/updateLoc")
	//class nao maiuscuklo
	public String updateLoc(@ModelAttribute("location") Location location, ModelMap modelMap)
	{
		Location loc = service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
		
	}
	@RequestMapping("/genRep")
	public String generateReport() {
		//get data 
		String path = context.getRealPath("/");
		List<Object[]> data = location.findTypeAndTypeCount();
		reportUtil.generatePiieChar(path, data);
		return "report";
	}
}
