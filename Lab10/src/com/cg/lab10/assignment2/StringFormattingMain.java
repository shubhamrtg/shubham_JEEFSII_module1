package com.cg.lab10.assignment2;

import java.util.Scanner;

public class StringFormattingMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		StringFormatting object=(input1)->{
			String newWord="";
			for(int index=0;index<input1.length();index++)
			{
				newWord=newWord+input1.charAt(index)+" ";
			}
			return newWord;
		};
		System.out.println("new word : "+object.formatString(input));
		sc.close();
	}
}
