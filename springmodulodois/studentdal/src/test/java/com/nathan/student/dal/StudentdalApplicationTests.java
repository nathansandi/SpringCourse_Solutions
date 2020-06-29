package com.nathan.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nathan.student.dal.entities.Student;
import com.nathan.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepossitory;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setCourse("Engenharia");
		student.setFee((double) 200);
		student.setName("Natieli");
	
		
		studentRepossitory.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		//Student student = new Student();
		Student student = studentRepossitory.findById((long) 1).get();
		System.out.println(student);
		
	}
	
	@Test
	public void testUpdateStudent() {
		
		Student student = studentRepossitory.findById((long) 1).get();
		System.out.println(student);
		student.setName("Nathanyel");
		
		studentRepossitory.save(student);
	}
	
	@Test
	public void testDelete() {
		
		studentRepossitory.deleteById((long) 1);
		
	}
	
	
	

}
