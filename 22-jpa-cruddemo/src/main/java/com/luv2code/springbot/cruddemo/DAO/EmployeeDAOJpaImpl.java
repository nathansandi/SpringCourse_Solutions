package com.luv2code.springbot.cruddemo.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springbot.cruddemo.entity.Employee;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		//create a querry
		Query theQ=entityManager.createQuery("from Employee");
		//execute querry and get result list
		List<Employee> employees = theQ.getResultList();
		return employees;

	}

	@Override
	public Employee findById(int id) {
	
		return entityManager.find(Employee.class,id);

	}

	@Override
	public void save(Employee theEmployee) {
		Employee dbEmployee = entityManager.merge(theEmployee);
		theEmployee.setId(dbEmployee.getId());

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		//delete
		Query theQ=entityManager.createQuery("delete from Employee where id=:employeeId");
		theQ.setParameter("employeeId", id);
		theQ.executeUpdate();

	}

}
