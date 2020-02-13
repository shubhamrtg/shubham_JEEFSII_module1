package com.cg.practiceDay2.exercise4;

public class Appearance 
{
	public boolean checkInput(String input)
	{
		int i=input.indexOf("xyz");
		if(i<0)
		{
			return false;
		}
		if(input.charAt(i-1)=='.')
		{
			return false;
		}
		return true;
	}
}
