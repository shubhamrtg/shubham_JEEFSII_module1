package com.cg.practiceDay2.exercise6;

import java.util.Scanner;


public class BalanceStringMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		BalanceString obj=new BalanceString();
		System.out.println(obj.checkBalance(input));
		sc.close();
	}

}
