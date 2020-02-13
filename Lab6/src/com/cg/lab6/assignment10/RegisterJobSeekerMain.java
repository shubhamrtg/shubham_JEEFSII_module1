package com.cg.lab6.assignment10;

import java.util.Scanner;

public class RegisterJobSeekerMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name to validate");
		String userName=sc.next();
		RegisterJobSeeker obj=new RegisterJobSeeker();
		System.out.println("user name registered : "+obj.validate(userName));
		sc.close();
	}

}
