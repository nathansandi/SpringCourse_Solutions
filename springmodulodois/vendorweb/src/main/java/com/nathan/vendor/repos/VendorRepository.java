package com.nathan.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathan.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
