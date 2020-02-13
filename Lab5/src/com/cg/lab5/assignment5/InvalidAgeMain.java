package com.cg.lab5.assignment5;

import java.util.Scanner;

import com.cg.eis.exception.InvalidAgeException;

public class InvalidAgeMain 
{
	public static void main(String[] args) 
	{
		InvalidAge object=new InvalidAge();
		Scanner scanObj=new Scanner(System.in);
		int inputAge=scanObj.nextInt();
		try 
		{
			object.validateAge(inputAge);
		}
		catch(InvalidAgeException e) 
		{
			System.out.println(e);
		}
		scanObj.close();
	}
}
