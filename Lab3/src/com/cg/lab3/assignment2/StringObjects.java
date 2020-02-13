package com.cg.lab3.assignment2;

import java.util.Arrays;

public class StringObjects 
{
	public String[] calculate(String s[])
	{
		int i;
		for(i=0;i<s.length;i++)
		{
			s[i]=s[i].toLowerCase();
		}
		Arrays.sort(s);
		if(s.length%2==0)
		{
			for(i=0;i<s.length/2;i++)
			{
				s[i]=s[i].toUpperCase();
			}
			for(i=s.length/2;i<s.length;i++)
			{
				s[i]=s[i].toLowerCase();
			}
		}
		else
		{
			for(i=0;i<=s.length/2;i++)
			{
				s[i]=s[i].toUpperCase();
			}
			for(i=s.length+1;i<s.length;i++)
			{
				s[i]=s[i].toLowerCase();
			}
		}
		return s;
	}
}
