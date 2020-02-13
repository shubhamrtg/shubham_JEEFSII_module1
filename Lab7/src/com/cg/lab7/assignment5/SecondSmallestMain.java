package com.cg.lab7.assignment5;

import java.util.Scanner;

public class SecondSmallestMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		SecondSmallest obj=new SecondSmallest();
		System.out.println("Enter size of array");
		int sizeOfArray=sc.nextInt();
		int array[]=new int[sizeOfArray];
		System.out.println("Enter elements in the array");
		for(int indexOfArray=0;indexOfArray<sizeOfArray;indexOfArray++)
		{
			array[indexOfArray]=sc.nextInt();
		}
		System.out.println("Second smallest number is : "+obj.sortValues(array));
		sc.close();
	}

}
