package com.aws.studentdetails.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aws.studentdetails.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	Student saveAndFlush(Student student);

	List<Student> findAll();

}
