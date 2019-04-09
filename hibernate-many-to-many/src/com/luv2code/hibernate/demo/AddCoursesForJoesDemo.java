package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class AddCoursesForJoesDemo {

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
			// get the student joe for database
			int theID =7;
			Student tempStudent = session.get(Student.class, theID);
			System.out.println("\n Loaded student;"+tempStudent);
			System.out.println("  Courses;"+tempStudent.getCourses());
			//create more coruses
			Course tempCourse1 = new Course("Rubi");
			Course tempCourse2 = session.get(Course.class, 5);
			
			//add joe to this courses
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			//save 
			System.out.println("\nWe are saving the courses");
			session.save(tempCourse1);
			session.save(tempCourse2);
		
			
			
			//commit
			session.getTransaction().commit();

		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}
