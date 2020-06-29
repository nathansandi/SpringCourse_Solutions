package com.luv2code.springdemo.rest;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.luv2code.springdemo.entity.Student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> theStudents;
	//define this list with some data
	
	//defind PostConstruct to load the sutdent data
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		theStudents.add(new Student("Nathan","Sandi"));
		theStudents.add(new Student("Miche","Sandi"));
		theStudents.add(new Student("Mariza","Sandi"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return theStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudentsId(@PathVariable int studentId) {
		//return the index student
		
		//check the student against list size
		
		if((studentId >= theStudents.size()) || studentId<0) {
			throw new StudentNotFoundException("Student not found  - " +studentId);
		}
		return theStudents.get(studentId);
	}
}
		
	

