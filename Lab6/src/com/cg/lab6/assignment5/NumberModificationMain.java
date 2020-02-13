package com.cg.lab6.assignment5;

import java.util.Scanner;

public class NumberModificationMain
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		NumberModification obj=new NumberModification();
		System.out.println("New number is : "+obj.modifyNumber(number));
		sc.close();
	}

}
