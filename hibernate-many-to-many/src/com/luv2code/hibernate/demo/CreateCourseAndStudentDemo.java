package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration().
									configure("hibernate.cfg.xml").
									addAnnotatedClass(Instructor.class).
									addAnnotatedClass(InstructorDetail.class).
									addAnnotatedClass(Course.class).
									addAnnotatedClass(Student.class).
									addAnnotatedClass(Review.class).
									buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//start
			session.beginTransaction();
			//create a course
			Course tempCourse = new Course("Pacman - Fundamentals of gosths");
			
			System.out.println("\n Saving the course..");
			session.save(tempCourse);
			System.out.println("\n Saved the course.."+tempCourse);
			
			//create the students
			Student tempStudent1= new Student ("Joe","Doe","j@p.com");
			
			//add
			tempCourse.addStudent(tempStudent1);
			//save
			System.out.println("\n Saving the Student..");
			session.save(tempStudent1);
			System.out.println("\n Saved the course.."+tempStudent1);
			//commit
			session.getTransaction().commit();

		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}
