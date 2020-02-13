package com.cg.practiceDay2.exercise1;

public class BiggerString 
{
	public String createBiggerString(String a, String b)
	{
		String newWord="";
		int l1=a.length();
		int l2=b.length();
		int i=0,j=0;
		while(i<l1 && j<l2)
		{
			newWord=newWord+a.charAt(i);
			i++;
			newWord=newWord+b.charAt(j);
			j++;
		}
		for(;i<l1;i++)
		{
			newWord=newWord+a.charAt(i);
		}
		for(;j<l2;j++)
		{
			newWord=newWord+b.charAt(j);
		}
		return newWord;
	}

}
