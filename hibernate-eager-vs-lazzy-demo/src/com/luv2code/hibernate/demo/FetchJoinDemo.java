package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class FetchJoinDemo {

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
			//retrieve courses
			Query<Instructor> query = 
					session.createQuery("select i from Instructor i "
							+"JOIN FETCH i.courses "
							+"where i.id=:theInstructorId",
							Instructor.class);
			//Set parameters on query
			query.setParameter("theInstructorId", theId);
			
			//exec query and get instrucot
			
			Instructor tempInstructor = query.getSingleResult();
			
			System.out.println("luv2code: Instructor: "+tempInstructor);
			
			//option 2: gibernate hql
			
			
			
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
