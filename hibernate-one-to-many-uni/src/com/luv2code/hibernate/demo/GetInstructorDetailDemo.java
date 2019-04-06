package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration().
									configure("hibernate.cfg.xml").
									addAnnotatedClass(Instructor.class).
									addAnnotatedClass(InstructorDetail.class).
									buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			
			//start
			session.beginTransaction();
			
			//get the instructor detail object
			int theId=2999;
			//print the instructor detail
			InstructorDetail tempIDetail = 
					session.get(InstructorDetail.class, theId);
			System.out.println("Recovery detail:"+tempIDetail);
			//print the associate instructor
			System.out.println("the associate:"+tempIDetail.getInstructor());
			
			//commit
			session.getTransaction().commit();

		}catch(Exception exc){
			exc.printStackTrace();
		}finally {
			//this is avoid locks issue.
			session.close();
			factory.close();
		}
	}

}
