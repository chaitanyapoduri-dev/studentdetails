package com.aws.studentdetails.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aws.studentdetails.model.Student;
import com.aws.studentdetails.service.StudentService;

@Transactional
@RestController
public class StudentDetailsController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = { "/student" }, method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getAllStudentDetails() {
		return null;
	}

	@RequestMapping(value = { "/student" }, method = RequestMethod.POST)
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return ResponseEntity.ok().body(studentService.addStudentDetails(student));
	}
}
