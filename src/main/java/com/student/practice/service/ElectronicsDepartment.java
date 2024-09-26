package com.student.practice.service;

import org.springframework.stereotype.Component;

@Component
public class ElectronicsDepartment implements Department{

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return "This is Electronics Department";
	}

}
