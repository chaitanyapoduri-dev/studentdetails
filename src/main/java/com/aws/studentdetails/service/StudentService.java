package com.aws.studentdetails.service;

import java.util.List;

import com.aws.studentdetails.model.Student;

public interface StudentService {

	public Student addStudentDetails(Student student);
	
	public List<Student> findAllStudent();
}
