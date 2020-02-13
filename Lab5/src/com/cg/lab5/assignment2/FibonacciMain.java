package com.cg.lab5.assignment2;

import java.util.Scanner;

public class FibonacciMain 
{
	public static void main(String[] args) 
	{
		FibonacciRecursive object1=new FibonacciRecursive();
		FibonacciNonRecursive object2=new FibonacciNonRecursive();
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter the element to show:");
		int inputNumber=scanObj.nextInt();
		System.out.println("Enter your choice:\n1.Recursive\n2.non recursive\n0.Exit");
		int choice=scanObj.nextInt();
		while(choice!=0)
		{
			switch(choice) 
			{
			case 1:
				System.out.println("The element is "+object1.showElement(inputNumber));
				break;
			case 2:
				System.out.println("The element is:"+object2.showElement(inputNumber));
				break;
			default:
				System.out.println("Go home you are drunk..!!");
			}
			System.out.println("Enter the element to show:");
			inputNumber=scanObj.nextInt();
			System.out.println("Enter your choice:\n1.Recursive\n2.non recursive\n0.Exit");
			choice=scanObj.nextInt();
		}
		scanObj.close();
	}

}
