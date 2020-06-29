package com.nathan.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.nathan.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
