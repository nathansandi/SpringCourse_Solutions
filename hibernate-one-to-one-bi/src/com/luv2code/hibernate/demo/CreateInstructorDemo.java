package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {

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
			//create the objects
			//Instructor tempInstructor =
			//		new Instructor("Nathan","Sandi","nathan.sandi@gmail.com");
			//
			//InstructorDetail tempInstructorDetail = 
			//		new InstructorDetail("link/nathan","Chess");
			//associate
			//tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//create the objects
			Instructor tempInstructor =
					new Instructor("Pedro","Sandi","ppp@gmail.com");
			
			InstructorDetail tempInstructorDetail = 
					new InstructorDetail("link/pedro","soccer");
			//associate
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			
			//start
			session.beginTransaction();
			
			//save
			//Note -- this s also save the details as it a cascade
			System.out.println("Saving Instructor: "+tempInstructor);
			session.save(tempInstructor);
			
			//commit
			session.getTransaction().commit();

		}finally {
			factory.close();
		}
	}

}
