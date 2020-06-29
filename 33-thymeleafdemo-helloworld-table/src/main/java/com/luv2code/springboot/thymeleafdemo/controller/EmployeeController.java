package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	//load employee data
	private List<Employee> theEmployee;
	
	@PostConstruct
	private void loadData() {
		//create employees
		Employee emp1 = new Employee(1,"Teste","Nathan","natham@am");
		Employee emp2 = new Employee(1,"Teste 2","Nathan","natham@am");
		Employee emp3 = new Employee(1,"Teste 4","Nathan","natham@am");
		//create the list
		theEmployee = new ArrayList<>();
		
		//add to the list
		theEmployee.add(emp1);
		theEmployee.add(emp2);
		theEmployee.add(emp3);
		
	}
	
	//add map in list 
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		theModel.addAttribute("employees",theEmployee);
		return "list-employees";
	}
	
	
}
