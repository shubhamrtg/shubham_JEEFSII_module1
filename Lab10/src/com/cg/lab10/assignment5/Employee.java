package com.cg.lab10.assignment5;

import java.time.LocalDate;

public class Employee
{
	int employeeID, managerID;
	String firstName, lastName, email, phoneNumber, designation;
	double salary;
	LocalDate hireDate;
	Department department;
	
	public Employee(int employeeID, int managerID, String firstName, String lastName, String email, String phoneNumber, String designation, double salary,
			LocalDate hireDate, Department department) 
	{
		this.employeeID = employeeID;
		this.managerID = managerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.salary = salary;
		this.hireDate = hireDate;
		this.department = department;
	}
	
}
