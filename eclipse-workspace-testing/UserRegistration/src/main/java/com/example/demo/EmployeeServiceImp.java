package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeRepository emp;

	@Override
	public String addEmployee(long empid, String firstname, String lastname, long phone, String email,
			String department, String loaction) {
		Employee e1 = new Employee();
		e1.setEmpid(empid);
		e1.setFirstname(firstname);
		e1.setLastname(lastname);
		e1.setPhone(phone);
		e1.setEmail(email);
		e1.setDepartment(department);
		e1.setLoaction(loaction);	
		return "Data updated successfully";
	}


}
