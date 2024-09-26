package com.student.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.practice.service.Department;


@RestController
public class StudentDetailsController {
	
	@Value("${student.name}")
	private String studentName;
	
	@Value("${student.dept}")
	private String studentDept;
	
	private Department myDepartment;
	private Department myDepartmentsetter;
	private Department myDepartmentPrimary;
	
	
	//Constructor Injection
	@Autowired
	public StudentDetailsController(@Qualifier("electronicsDepartment") Department theDepartment) {
		
		//To validate lazy Initialization in console
		System.out.println("In constructor: " + getClass().getSimpleName());
		myDepartment = theDepartment;
	}
	
	//Setter injection
	@Autowired
	public void setDepartment(@Qualifier("civilDepartment")  Department setterDepartment) {
		myDepartmentsetter = setterDepartment;
	}
	
	
	@Autowired
	public void setDepartmentPrimary(Department primaryDepartment) {
		myDepartmentPrimary = primaryDepartment;
	}
	
	@GetMapping("/Electrical")
	public String getDepartmentDetailsPrimary() {
		return myDepartmentPrimary.getDepartment();
	}
	
	@GetMapping("/Electronics")
	public String getDepartmentDetails() {
		return myDepartment.getDepartment();
	}
	
	@GetMapping("/Civil")
	public String getDepartmentSetter() {
		return myDepartmentsetter.getDepartment();
	}
	
	@GetMapping("/studentdetails")
	public String getStudentDetails() {
		return "Student Name: " + studentName +"\n Student Department: " + studentDept;
	}
	
	@GetMapping("/hello")
	public String sayHello(){
		return "Hello World";
	}
	
	@GetMapping("/test1")
	public String testDevtools() {
		return "Test Dev Tools 1";
	}
	
	@GetMapping("/test2")
	public String testDevtools2() {
		return "Test Dev Tools 2";
	}
	
}
