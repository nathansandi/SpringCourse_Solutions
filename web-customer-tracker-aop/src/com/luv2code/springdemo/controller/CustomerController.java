package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//need to inject DAO into this controler
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")  //Will reject other kinds of reques
	public String listCustomers(Model theModel) {
		
		//get customers from the service
		List<Customer> theCustomer  =customerService.getCustomers();
		//add the customers to the model
		theModel.addAttribute("customers",theCustomer);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		//Create the new model attribute
		
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer",theCustomer);
		
		return "customer-form";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		
		//save the customer using our service
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {
		//get the customer
		Customer theCustomer= customerService.getCustomer(theId);
		//set customer as model
		theModel.addAttribute("customer",theCustomer);
		//send over to our form
		return "customer-form";
	}
	@GetMapping("/delete")
	public String deleteCustomer(@ModelAttribute("customerId") int theId, Model theModel) {
		//save the customer using our service
		customerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
	}
	
	
}
