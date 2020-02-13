package com.cg.lab5.assignment5;
import com.cg.eis.exception.InvalidAgeException;

public class InvalidAge 
{
	public void validateAge(int age) throws InvalidAgeException
	{
		if(age<=15) 
		{
			throw new InvalidAgeException("Age should be above 15.");
		}
		else 
		{
			System.out.println("Okay!!");
		}
	}
}
