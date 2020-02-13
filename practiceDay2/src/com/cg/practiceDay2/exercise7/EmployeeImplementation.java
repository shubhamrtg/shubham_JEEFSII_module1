package com.cg.practiceDay2.exercise7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeImplementation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of employees");
		int n=sc.nextInt();
		List<Employee> empList=new ArrayList<Employee>();
		System.out.println("Enter employee details");
		for(int i=0;i<n;i++)
		{
			Employee obj=new Employee();
			obj.setEmpID(sc.nextInt());
			obj.setName(sc.next());
			obj.setSalary(sc.nextDouble());
			obj.setMngrName(sc.next());
			obj.setDeptNo(sc.nextInt());
			empList.add(obj);
		}
		
		Employee maxSalary=empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(maxSalary.toString());
		sc.close();
	}

}
