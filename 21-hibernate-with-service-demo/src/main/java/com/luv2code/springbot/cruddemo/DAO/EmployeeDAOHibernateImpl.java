package com.luv2code.springbot.cruddemo.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springbot.cruddemo.entity.Employee;
@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	//define field for entity manager
	private EntityManager entityManager;
	//setup constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		//get the hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create querry
		Query<Employee> theQ=
				currentSession.createQuery("from Employee",Employee.class);
		//execute
		List<Employee> res = theQ.getResultList();
		//return
		
		
		return res;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
				//get the hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
				//create querry
				Employee theQ=
						currentSession.get(Employee.class, id);
				//retorno employee				
				return theQ;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		//get the hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create querry
		

	    currentSession.saveOrUpdate(theEmployee);

		
	}
	


	

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		//get the hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create querry
		Query theQ=
				currentSession.createQuery("delete from Employee where id=:employeeId");
		theQ.setParameter("employeeId", id);
		theQ.executeUpdate();
		//retorno employee				
		
		
	}



}
