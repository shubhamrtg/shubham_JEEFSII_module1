package com.cg.lab10.assignment5;

public class Main 
{

	public static void main(String[] args) 
	{
		EmployeeService object=new EmployeeService();
		
		//sum of salaries of employees
		System.out.println("sum of salaries : "+object.sumOfSalary());
		
		//distinct departments
		System.out.println("Departments : "+object.listOfDepartment());
		
		System.out.println("Senior most Employee : "+object.findSeniorEmployee().firstName+", hire date : "+object.findSeniorEmployee().hireDate);
	}

}
