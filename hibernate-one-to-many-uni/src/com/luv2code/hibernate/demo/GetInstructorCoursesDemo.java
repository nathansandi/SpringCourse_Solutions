package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class GetInstructorCoursesDemo {

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
			System.out.println("Instructor: "+tempInstructor);
			System.out.println("Courses: "+tempInstructor.getCourses());
			//commit
			session.getTransaction().commit();

		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}
