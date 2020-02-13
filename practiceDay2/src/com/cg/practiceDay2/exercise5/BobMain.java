package com.cg.practiceDay2.exercise5;

import java.util.Scanner;


public class BobMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		Bob obj=new Bob();
		System.out.println(obj.bobThere(input));
		sc.close();
	}

}
