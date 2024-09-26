package com.student.practice.service;

import org.springframework.stereotype.Component;

@Component
public class CivilDepartment implements Department{

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return "This is Civil Department";
	}

}
