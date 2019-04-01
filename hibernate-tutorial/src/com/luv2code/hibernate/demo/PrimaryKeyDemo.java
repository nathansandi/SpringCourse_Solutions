package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration().
									configure("hibernate.cfg.xml").
									addAnnotatedClass(Student.class).
									buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//use the session object to save the java object
			//create a student object 
			System.out.println("Creating 3 new students object...");
			Student tempStudent = new Student("Nathan0","Sandi0","nathan0@g.com");
			Student tempStudent1 = new Student("Nathan1","Sandi1","nathan1@g.com");
			Student tempStudent2 = new Student("Nathan2","Sandi1","nathan2@g.com");
			//start a transaction
			session.beginTransaction();
			//save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);
			session.save(tempStudent1);
			session.save(tempStudent2);
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
				
		}finally {
			factory.close();
		}
	}
}
