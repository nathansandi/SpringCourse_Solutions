package com.nathan.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathan.vendor.entities.Vendor;
import com.nathan.vendor.repos.VendorRepository;
@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepository vendorRep;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorRep.save(vendor);
		
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorRep.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		vendorRep.delete(vendor);
		// TODO Auto-generated method stub

	}

	@Override
	public Vendor getLocationbyId(int id) {
		// TODO Auto-generated method stub
		Vendor result = vendorRep.findById(id).get();
		return result;
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		
		return vendorRep.findAll();
	}

}
