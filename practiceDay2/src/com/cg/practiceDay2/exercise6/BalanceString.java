package com.cg.practiceDay2.exercise6;

public class BalanceString 
{
	public boolean checkBalance(String input)
	{
		int i=input.lastIndexOf('x');
		if(input.substring(i).contains("y"))
		{
			return true;
		}
		return false;
	}

}
