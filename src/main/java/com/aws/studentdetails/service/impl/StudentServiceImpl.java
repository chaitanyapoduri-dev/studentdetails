package com.aws.studentdetails.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.studentdetails.model.Student;
import com.aws.studentdetails.repository.StudentRepository;
import com.aws.studentdetails.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudentDetails(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}

}
