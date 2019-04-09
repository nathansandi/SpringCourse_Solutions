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
	@Transactional
	public List<Customer> getCustomers() {
		
		//get the current hibernate session
		Session currentSession =sessionFactory.getCurrentSession();
		//create a querry2
		Query<Customer> theQuery =
				currentSession.createQuery("from Customer",Customer.class);
		//execute querry and get results list
		List<Customer> customers = theQuery.getResultList();
		//return list of customers
		return customers;
	}

}
