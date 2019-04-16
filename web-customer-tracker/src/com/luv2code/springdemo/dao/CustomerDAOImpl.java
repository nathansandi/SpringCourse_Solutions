package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;
//Always aply this notation for DAO implementetion
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	//need to inject the session factory
	//avaliar o pom.xml
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		//get the current hibernate session
		Session currentSession =sessionFactory.getCurrentSession();
		//create a querry2...sort by last name
		Query<Customer> theQuery =
				currentSession.createQuery("from Customer order by last_name",Customer.class);
		//execute querry and get results list
		List<Customer> customers = theQuery.getResultList();
		//return list of customers
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		//get current hibernate session
		Session currentSession =sessionFactory.getCurrentSession();
		//save the customer
		currentSession.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession =sessionFactory.getCurrentSession();
		//create a querry2...sort by last name
		Customer customer = 
				currentSession.get(Customer.class,theId);
		//return list of customers
		return customer;
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session currentSession =sessionFactory.getCurrentSession();
		//create a querry2...sort by last name
		Customer customer = 
				currentSession.get(Customer.class,theId);
		//return list of customers
		currentSession.delete(customer);
	}

}
