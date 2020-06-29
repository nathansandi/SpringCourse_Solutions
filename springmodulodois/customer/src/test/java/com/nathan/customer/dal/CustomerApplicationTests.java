package com.nathan.customer.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nathan.customer.dal.entities.Customer;
import com.nathan.customer.dal.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerApplicationTests {

	@Autowired
	private CustomerRepository customerRepossitory;
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setEmail("nathan.sandi@gmail.com");
		customer.setName("Nathan");
	
	
		
		customerRepossitory.save(customer);
	}
	
	@Test
	public void testFindCustomerById() {
		//Student student = new Student();
		Customer customer = customerRepossitory.findById(2).get();
		System.out.println(customer);
		
	}
	
	@Test
	public void testUpdateCustomer() {
		
		Customer customer = customerRepossitory.findById(2).get();
		System.out.println(customer);
		customer.setName("Daniela");
		
		customerRepossitory.save(customer);
	}
	
	/*@Test
	public void testCustomer() {
		
		customerRepossitory.deleteById(1);
		
	}*/
	

}
