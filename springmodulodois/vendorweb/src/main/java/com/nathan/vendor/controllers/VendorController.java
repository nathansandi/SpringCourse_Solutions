package com.nathan.vendor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nathan.vendor.entities.Vendor;
import com.nathan.vendor.service.VendorService;


@Controller
public class VendorController {
	@Autowired
	VendorService service;
	
	
	@RequestMapping("/showcreateS")
	public String showCreate()
	{
		return "main";
	}
	@RequestMapping("/saveVen")
	//class nao maiuscuklo
	public String saveLoc(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap)
	{
		Vendor ven = service.saveVendor(vendor);
		String msg = "Vendor saved with id: " + ven.getId();
		modelMap.addAttribute("msg",msg);
		return "main";
		
	}
}
