package com.luv2code.springboot.thymeleafdemo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//dont need any code we already have crud methods
	
	//add method to sort by laste name 

}
