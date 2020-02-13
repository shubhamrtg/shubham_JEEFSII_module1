package com.cg.lab6.assignment3;

public class MirrorImage 
{
	public String getImage(String s) 
	{
		String result;
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		result=s+" | "+sb;
		return result;
	}
}
