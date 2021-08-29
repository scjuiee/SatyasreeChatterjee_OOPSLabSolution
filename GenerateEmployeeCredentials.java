package com.greatlearning.iitr.fullstacktraining.java.oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greatlearning.iitr.fullstacktraining.java.oops.pojo.Employee;
import com.greatlearning.iitr.fullstacktraining.java.oops.service.CredentialService;

public class GenerateEmployeeCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		try {
			// Create a Scanner object
			System.out.println("Enter FirstName");

			String firstName = myObj.nextLine(); // Read user input
			System.out.println("Enter LastName");
			String lastName = myObj.nextLine();

			Employee employee = new Employee(firstName, lastName);

			System.out.println("Please Enter the Department No from the following :");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. HumanResource");
			System.out.println("4. Legal");
			String department = "";

			department = myObj.nextLine();

			Map<String, String> departmentMap = new HashMap<String, String>();
			departmentMap.put("1", "tech");
			departmentMap.put("2", "admin");
			departmentMap.put("3", "hr");
			departmentMap.put("4", "legal");

			if (department != null && department.trim().length() > 1) {
				System.out.println("Please enter correct department index");
				department = myObj.nextLine();
				if (department == null || department.isEmpty()) {
					System.out.println("Please provide correct input next time");
					System.exit(-1);
				}
			}

			if (!departmentMap.containsKey(department)) {
				System.out.println("Please enter correct department index from the list mentioned above");
				department = myObj.nextLine();
				if (department == null || department.isEmpty()) {
					System.out.println("Please provide correct input next time");
					System.exit(-1);
				}
			} else {
				employee.setDepartment(departmentMap.get(department));
			}
			CredentialService credentialService = new CredentialService();
			credentialService.showCredentials(employee);
		} finally {
			myObj.close();
		}
	}

}
