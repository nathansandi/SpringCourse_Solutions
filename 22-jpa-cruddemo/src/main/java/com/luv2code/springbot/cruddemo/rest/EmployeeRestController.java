package com.luv2code.springbot.cruddemo.rest;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.luv2code.springbot.cruddemo.entity.*;
import com.luv2code.springbot.cruddemo.service.EmployeeService;
import com.luv2code.springbot.cruddemo.DAO.EmployeeDAO;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private EmployeeService employeeService;
	//inject emplyee DAO
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeDAO) {
		employeeService = theEmployeeDAO;
	}
	//explose /employees and return list of employees
	
	@GetMapping("/employee")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId){
		Employee theEmployee = employeeService.findById(employeeId);
		if(theEmployee==null) {
			throw new RuntimeException( "Not found");
		}
		return theEmployee;
		
	}

	@DeleteMapping("/employee/{employeeId}")
	public String delete(@PathVariable int employeeId){
		Employee theEmployee = employeeService.findById(employeeId);
		if(theEmployee==null) {
			throw new RuntimeException( "Not found");
		}
		employeeService.deleteById(employeeId);
		return "Deletado";
		
	}
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee theEmployee){
		theEmployee.setId(0);
		//0 force an insert
		
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	@PutMapping("/employee")
	public Employee updateService(@RequestBody Employee theEmployee){
	
		//0 force an insert
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	
	
	
}
