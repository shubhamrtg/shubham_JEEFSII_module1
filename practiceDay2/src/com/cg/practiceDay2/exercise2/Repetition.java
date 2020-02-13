package com.cg.practiceDay2.exercise2;

public class Repetition 
{
	public String repeatEnd(String input, int n)
	{
		String newWord="";
		String lastNLetters=input.substring(input.length()-n);
		for(int i=0;i<n;i++)
		{
			newWord=newWord+lastNLetters;
		}
		return newWord;
	}

}
