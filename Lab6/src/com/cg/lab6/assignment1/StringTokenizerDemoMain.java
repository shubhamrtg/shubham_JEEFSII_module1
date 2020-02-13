package com.cg.lab6.assignment1;

import java.util.Scanner;

public class StringTokenizerDemoMain 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		String s= sc.nextLine();
		StringTokenizerDemo obj=new StringTokenizerDemo();
		System.out.println();
		System.out.println(obj.calculateSum(s));
		sc.close();
	}

}
