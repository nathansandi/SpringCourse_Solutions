package com.nathan.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.nathan.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
