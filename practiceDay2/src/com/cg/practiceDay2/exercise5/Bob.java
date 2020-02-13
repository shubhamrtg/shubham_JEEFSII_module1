package com.cg.practiceDay2.exercise5;

public class Bob 
{
	public boolean bobThere(String input)
	{
		for(int i=0;i<input.length()-2;i++)
		{
			if((input.charAt(i)=='b' || input.charAt(i)=='B') && (input.charAt(i+2)=='b' || input.charAt(i+2)=='B'))
			{
				return true;
			}
		}
		return false;
	}
}
