package com.cg.lab7.assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSortedArrayMain 
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		ReverseSortedArray obj=new ReverseSortedArray();
		System.out.println("Enter size of array");
		int sizeOfArray=sc.nextInt();
		int array[]=new int[sizeOfArray];
		System.out.println("Enter elements in the array");
		for(int indexOfArray=0;indexOfArray<sizeOfArray;indexOfArray++)
		{
			array[indexOfArray]=sc.nextInt();
		}
		System.out.println("New array is : "+(Arrays.toString(obj.getSorted(array))));
		sc.close();
	}

}
