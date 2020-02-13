package com.cg.lab6.assignment8;

import java.util.Scanner;

public class PositiveStringMain
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String input=sc.next();
		PositiveString obj=new PositiveString();
		System.out.println("String is positive : "+obj.isPositiveString(input));
		sc.close();
	}

}
