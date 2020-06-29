package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	//load employee data
	private List<Employee> theEmployee;
	private EmployeeService employeeService;
	public EmployeeController(EmployeeService theEmpService) {
		employeeService= theEmpService;
	}
	

	//add map in list 
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> theEmployee = employeeService.findAll();
		
		theModel.addAttribute("employees",theEmployee);
		return "employees/list-employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Employee theEmployee = new Employee();
		
		theModel.addAttribute("employee",theEmployee);
		return "employees/employee-form";
	}
	
	@PostMapping("/save")
	public String saveForm(@ModelAttribute("employee") Employee theEmployee) {
		//Save
		employeeService.save(theEmployee);
		
		//use redirect 
		return "redirect:/employees/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {
		//get the employee from the service
		Employee theEmployee = employeeService.findById(theId);
		
		theModel.addAttribute("employee",theEmployee);
	
		
		return "employees/employee-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId, Model theModel) {
		//get the employee from the service
		employeeService.deleteById(theId);
		
		theModel.addAttribute("employee",theEmployee);
	
		return "redirect:/employees/list";
	}
	
	
	
}
