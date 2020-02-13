package com.cg.lab5.assignment4;
import com.cg.eis.exception.ValidateEmployeeNameException;

public class ValidateEmployeeName 
{
	public void validateName(String firstName,String secondName) throws ValidateEmployeeNameException
	{
		if(firstName.isEmpty() || secondName.isEmpty()) 
		{
			throw new ValidateEmployeeNameException("Field cannot be empty");
		}
		else 
		{
			System.out.println("First name: "+firstName+"\n"+"second name:"+secondName);
		}
	}
}
