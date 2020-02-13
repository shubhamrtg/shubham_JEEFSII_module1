package com.cg.lab6.assignment4;

import java.util.Scanner;

public class AlterStringMain {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a stirng");
		String s= sc.nextLine();
		AlterString obj=new AlterString();
		System.out.println(obj.alterString(s));
		sc.close();
	}
}
