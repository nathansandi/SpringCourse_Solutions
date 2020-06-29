package com.luv2code.springbot.cruddemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springbot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//dont need any code we already have crud methods
}
