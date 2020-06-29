package com.nathan.vendor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nathan.vendor.entities.Vendor;

public interface VendorService {
	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deleteVendor(Vendor vendor);
	Vendor getLocationbyId(int id);
	List<Vendor> getAllVendors();
}

