package com.cg.practice.assignment4;

import java.util.Scanner;

public class UserInterface 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter gender");
		char gender=sc.next().charAt(0);
		System.out.println("Enter category");
		String category=sc.next();
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		
		Employee employeeObject=new Employee();
		employeeObject.setName(name);
		employeeObject.setGender(gender);
		employeeObject.setCategory(category);
		try 
		{
			employeeObject.setSalary(salary);
		} 
		catch (SalaryNegativeException e) 
		{
			System.out.println(e);
		}
		sc.close();
	}

}
