package com.cg.lab7.assignment8;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesMain 
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		RemoveDuplicates obj=new RemoveDuplicates();
		System.out.println("Enter size of array");
		int sizeOfArray=sc.nextInt();
		int array[]=new int[sizeOfArray];
		System.out.println("Enter elements in the array");
		for(int indexOfArray=0;indexOfArray<sizeOfArray;indexOfArray++)
		{
			array[indexOfArray]=sc.nextInt();
		}
		System.out.println("New array is : "+(Arrays.toString(obj.modifyArray(array))));
		sc.close();
	}
}
