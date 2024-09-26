package com.student.practice.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ElectricalDepartment implements Department{

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return "This is Electrical Department.";
	}

}
