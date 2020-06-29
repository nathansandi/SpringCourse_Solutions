package com.luv2code.springbot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springbot.cruddemo.DAO.EmployeeRepository;
import com.luv2code.springbot.cruddemo.entity.Employee;



@Service
public class EmployeeServiceImlp implements EmployeeService{
	
	private EmployeeRepository employeeDAO;
	
	@Autowired
	public EmployeeServiceImlp(EmployeeRepository theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> result = employeeDAO.findById(id);
		Employee theE=null;
		if(result.isPresent()) {
			theE=result.get();
			
		}else {
			throw new RuntimeException("Did not find employee id - " + id);
		}
		return theE;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDAO.save(theEmployee);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeDAO.deleteById(id);

	}



}
