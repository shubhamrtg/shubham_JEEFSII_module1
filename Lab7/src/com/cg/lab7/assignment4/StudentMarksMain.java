package com.cg.lab7.assignment4;

import java.util.HashMap;
import java.util.Scanner;


public class StudentMarksMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentMarks obj=new StudentMarks();
		HashMap<Integer,Integer> students=new HashMap<Integer,Integer>();
		System.out.println("Enter registration number and marks... Press q to quit");
		String key="";
		while(true)
		{
			key=sc.next();
			if((key.equalsIgnoreCase("q"))==true)
				break;
			students.put(Integer.parseInt(key),sc.nextInt());
		}
		System.out.println(obj.getStudents(students));
		sc.close();
	}

}
