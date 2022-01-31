package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	long empid;
	
	String firstname;
	String lastname;
	long phone;
	String email;
	String department;
	String loaction;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstname, String lastname, long empid, long phone, String email, String department,
			String loaction) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.empid = empid;
		this.phone = phone;
		this.email = email;
		this.department = department;
		this.loaction = loaction;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLoaction() {
		return loaction;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", empid=" + empid + ", phone=" + phone
				+ ", email=" + email + ", department=" + department + ", loaction=" + loaction + "]";
	}

}
