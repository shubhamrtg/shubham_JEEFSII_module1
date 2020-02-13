package com.cg.lab6.assignment9;

import java.util.Scanner;

public class DurationMain 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a date in dd mm yyyy format");
		String date=sc.nextLine();
		Duration obj=new Duration();
		obj.durationBetween(date);
		sc.close();
	}

}
