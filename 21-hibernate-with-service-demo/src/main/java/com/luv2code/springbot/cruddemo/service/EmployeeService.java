package com.luv2code.springbot.cruddemo.service;

import java.util.List;

import com.luv2code.springbot.cruddemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee theEmployee);
	public void deleteById(int id);
}
