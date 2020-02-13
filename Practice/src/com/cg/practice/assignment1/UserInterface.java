package com.cg.practice.assignment1;

import java.util.Scanner;

public class UserInterface 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of calls");
		int n=sc.nextInt();
		CallHistory callObject=new CallHistory();
		System.out.println("Enter call details : ");
		for(int i=0;i<n;i++)
		{
			String input=sc.next();
			Call obj=new Call();
			obj.parseData(input);
	    	callObject.addCall(obj);;
	    }
	    System.out.println("Enter called number : ");
	    long calledNumber=sc.nextLong();
	    System.out.println(callObject.findTotalDuration(calledNumber));
        sc.close();
	}
}
