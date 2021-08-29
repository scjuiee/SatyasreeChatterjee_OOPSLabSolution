package com.greatlearning.iitr.fullstacktraining.java.oops.pojo;

public class Employee {
	
	public String firstName;
	public String lastName;
	public String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	

}
