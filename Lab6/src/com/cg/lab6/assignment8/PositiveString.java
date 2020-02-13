package com.cg.lab6.assignment8;

public class PositiveString 
{
	public boolean isPositiveString(String input)
	{
		for(int i=0;i<input.length()-1;i++)
		{
			if(input.charAt(i) > input.charAt(i+1))
				return false;
		}
		return true;
	}

}
