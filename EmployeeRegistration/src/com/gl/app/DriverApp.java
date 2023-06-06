package com.gl.app;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.EmployeeServiceimpl;

public class DriverApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first name:" );
		String fName = sc.next();
		System.out.println("enter your last name:" );
		String lName = sc.next();
		
		Employee emp = new Employee();
		emp.setFirstName(fName);
		emp.setLastName(lName);
		EmployeeServiceimpl esi = new EmployeeServiceimpl()	;
		System.out.println("1.Techenical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		String gEmail ="";
		String gPass = "";
		
		switch(choice)
		{
		case 1:gEmail =  esi.generateUserEmail(emp.getFirstName(), emp.getLastName(), "tech");
		
			break;
		case 2:gEmail = esi.generateUserEmail(emp.getFirstName(), emp.getLastName(), "admin");
			break;
		case 3:gEmail = esi.generateUserEmail(emp.getFirstName(), emp.getLastName(), "hr");
			break;
		case 4:gEmail = esi.generateUserEmail(emp.getFirstName(), emp.getLastName(), "legal");
			break;
			default:
			System.out.println("enter valid input");
		}
		
		gPass = esi.generateUserPassword();
		emp.setUserEmail(gEmail);
		emp.setPassword(gPass);
		esi.displayEmployeeDetails(emp);
	}

}
