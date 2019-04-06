package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class DeleteCoursesAndReviewsDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration().
									configure("hibernate.cfg.xml").
									addAnnotatedClass(Instructor.class).
									addAnnotatedClass(InstructorDetail.class).
									addAnnotatedClass(Course.class).
									addAnnotatedClass(Review.class).
									buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//start
			session.beginTransaction();
			//create a course
			
			//get the course
			int theId=6;
			Course tempCourse = session.get(Course.class, theId);	
			//print the course
			System.out.println("Course: "+tempCourse);
			//print the course reviews 
			System.out.println("Reviews: "+tempCourse.getReview());
			session.delete(tempCourse);
			//commit
			//commit
			session.getTransaction().commit();

		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}
