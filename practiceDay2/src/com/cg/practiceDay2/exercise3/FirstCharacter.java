package com.cg.practiceDay2.exercise3;

public class FirstCharacter 
{
	public String repeatStart(String input, int n)
	{
		String newWord="";
		while(n>0)
		{
			newWord=newWord+input.substring(0, n);
			n--;
		}
		return newWord;
	}

}
