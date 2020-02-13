package com.cg.practiceDay2.exercise2;

import java.util.Scanner;

public class RepetitionMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		Repetition obj=new Repetition();
		System.out.println("new word : "+obj.repeatEnd(input, n));
		sc.close();
	}

}
