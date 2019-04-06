package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration().
									configure("hibernate.cfg.xml").
									addAnnotatedClass(Instructor.class).
									addAnnotatedClass(InstructorDetail.class).
									addAnnotatedClass(Course.class).
									buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//start
			session.beginTransaction();
			//get instructor from db
			int theId=5;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			//retrieve courses
			System.out.println("luv2code: Instructor: "+tempInstructor);
			System.out.println("luv2code: Courses: "+tempInstructor.getCourses());
			
			//commit
			session.getTransaction().commit();
			session.close();
			System.out.println("\n \n The section is now closed! \n");
	
			//TO SOLVE 
			//option 1 call getter method while session is open 
			System.out.println("luv2code: Courses: "+tempInstructor.getCourses());
			

		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}
