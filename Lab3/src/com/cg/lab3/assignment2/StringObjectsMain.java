package com.cg.lab3.assignment2;

import java.util.Scanner;

public class StringObjectsMain 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		StringObjects obj=new StringObjects();
		System.out.println("Enter size of array");
		int sizeOfArray=ob.nextInt();
		String s[]=new String[sizeOfArray];
		System.out.println("Enter elements in array");
		for(int i=0;i<sizeOfArray;i++)
		{
			s[i]=ob.nextLine();
		}
		s=obj.calculate(s);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		ob.close();
	}
}
