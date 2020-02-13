package com.cg.lab6.assignment10;

public class RegisterJobSeeker 
{
	public boolean validate(String userName)
	{
		if(userName.endsWith("_job"))
		{
			if(userName.length()>=12)
				return true;
		}
		return false;
	}

}
