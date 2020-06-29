package com.luv2code.springbot.cruddemo.DAO;
import java.util.List;

import com.luv2code.springbot.cruddemo.entity.Employee;
public interface EmployeeDAO {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee theEmployee);
	public void deleteById(int id);
}
