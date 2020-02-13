package com.cg.lab7.assignment2;

import java.util.Scanner;

public class CountFrequencyMain 
{

	public static void main(String[] args) 
	{
		CountFrequency obj=new CountFrequency();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String inputString=sc.nextLine();
		inputString=inputString.replace(" ", "");
		System.out.println(obj.countCharacter(inputString));
		sc.close();
	}

}
