package com.cg.practiceDay2.exercise3;

import java.util.Scanner;


public class FirstCharacterMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		FirstCharacter obj=new FirstCharacter();
		System.out.println("new word : "+obj.repeatStart(input, n));
		sc.close();
	}

}
