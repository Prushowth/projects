package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empservice;
	
	@PostMapping("/add/{empid}/{firstname}/{lastname}/{phone}/{email}/{department}/{loaction}")
	public String addAccount(@PathVariable("empid") long empid,
			@PathVariable("firstname") String firstname,
			@PathVariable("lastname") String lastname,
			@PathVariable("phone") long phone,
			@PathVariable("email") String email,
			@PathVariable("department") String department,
			@PathVariable("loaction") String loaction) {

		return empservice.addEmployee(empid, firstname, lastname, phone, email, department, loaction);
				
	}

}
