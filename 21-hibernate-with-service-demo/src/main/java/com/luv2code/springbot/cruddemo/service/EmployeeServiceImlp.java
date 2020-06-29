package com.luv2code.springbot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springbot.cruddemo.DAO.EmployeeDAO;
import com.luv2code.springbot.cruddemo.entity.Employee;

import com.luv2code.springbot.cruddemo.DAO.EmployeeDAO;

@Service
public class EmployeeServiceImlp implements EmployeeService{
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImlp(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeDAO.deleteById(id);

	}



}
