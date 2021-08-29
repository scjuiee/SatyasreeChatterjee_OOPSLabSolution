package com.greatlearning.iitr.fullstacktraining.java.oops.service;

import com.greatlearning.iitr.fullstacktraining.java.oops.pojo.Employee;

public class CredentialService {
 
	public String generatePassword() {
	//This generates a 15 Character password	
	 String password = RandomPasswordGenerator.getAlphaNumericString(15);
	 return password;
	}
	
	public String generateEmailId(Employee employee) {
		String emailId= employee.getFirstName()+employee.getLastName()+"."+employee.getDepartment()+"@abc.com";
		return emailId;
	}
	
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+ employee.getFirstName()+ " your generated credentials are as follows: ");
		System.out.println("Email -->"+generateEmailId(employee));
		System.out.println("Password -->"+generatePassword());
	}
}
