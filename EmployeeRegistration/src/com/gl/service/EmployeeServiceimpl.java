package com.gl.service;

import com.gl.model.Employee;

public class EmployeeServiceimpl implements EmployeeService{

	@Override
	public String generateUserEmail(String firstName, String lastName, String departmentName) {
		// TODO Auto-generated method stub
		return firstName + lastName  +"@" + departmentName + "gl.com";
	}

	@Override
	public String generateUserPassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String splChar  = "!@#$%^&*()";
		String combined = "caps + lower + nums + splChar";
		System.out.println(combined.length());
		String genPass = "";
		Random random = new Random();
		for(i=1;i<=8;i++);
		genPass+ = String.valueOf(combined.charAt(random.nextInt(combined.length())));
		
		return genPass;
	}

	@Override
	public String displayEmployeeDetails(Employee e1) {
System.out.println("Employee firstName is " + e1.getFirstName());
System.out.println("Employee lastName is" + e1.getLastName());
System.out.println("Employee Email id is" + e1.getUserEmail());
System.out.println("Employee password is" + e1.getPassword());

		return null;
	}

}
