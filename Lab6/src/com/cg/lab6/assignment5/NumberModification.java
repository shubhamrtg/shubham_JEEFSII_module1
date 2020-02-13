package com.cg.lab6.assignment5;

public class NumberModification 
{
	public int modifyNumber(int number)
	{
		String newNumber="";
		String input=Integer.toString(number);
		for(int i=0;i<input.length()-1;i++)
		{
			newNumber=newNumber+Math.abs((int)input.charAt(i)-(int)input.charAt(i+1));
		}
		newNumber=newNumber+input.charAt(input.length()-1);
		number=Integer.parseInt(newNumber);
		return number;
	}
}
