package com.cg.lab6.assignment1;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{
	public int calculateSum(String s) 
	{
		int sum=0;
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()) 
		{
			Integer n=Integer.parseInt(st.nextToken());
			System.out.print(n+" ");
			sum+=n;
		}
		return sum;
	}
}
