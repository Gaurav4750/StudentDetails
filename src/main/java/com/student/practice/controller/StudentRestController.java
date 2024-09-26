package com.student.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.practice.entity.Student;

@RestController
@RequestMapping("/studentapi")
public class StudentRestController {
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Aman","Gupta"));
		theStudents.add(new Student("Amit","Jain"));
		theStudents.add(new Student("Rohit","Singh"));
		theStudents.add(new Student("Pankaj","Chauhan"));
		
		return theStudents;
	}

}
