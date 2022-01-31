package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	
	public String addEmployee(long empid, String firstname, String lastname, long phone, String email, 
			String department,String loaction);
	
	
	

}
