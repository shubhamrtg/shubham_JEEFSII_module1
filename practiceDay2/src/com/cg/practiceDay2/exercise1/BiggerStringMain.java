package com.cg.practiceDay2.exercise1;

import java.util.Scanner;

public class BiggerStringMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 words");
		String a=sc.next();
		String b=sc.next();
		BiggerString obj=new BiggerString();
		System.out.println("new word : "+obj.createBiggerString(a, b));
		sc.close();
	}

}
