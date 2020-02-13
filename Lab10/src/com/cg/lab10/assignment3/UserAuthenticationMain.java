package com.cg.lab10.assignment3;

import java.util.Scanner;

public class UserAuthenticationMain
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String userName=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		UserAuthentication object=(userName1,password1)->{
			if(userName1.equals(UserAuthentication.defaultUserName) && password1.equals(UserAuthentication.defaultPassword))
				return true;
			else
				return false;
		};
		if(object.authenticateUser(userName, password))
		{
			System.out.println("Access granted..!!");
		}
		else
		{
			System.out.println("Access denied..!!");
		}
		sc.close();
	}

}
