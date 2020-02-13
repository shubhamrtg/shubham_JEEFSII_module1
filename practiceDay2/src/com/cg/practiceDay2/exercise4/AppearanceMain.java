package com.cg.practiceDay2.exercise4;

import java.util.Scanner;


public class AppearanceMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		Appearance obj=new Appearance();
		System.out.println(obj.checkInput(input));
		sc.close();
	}

}
