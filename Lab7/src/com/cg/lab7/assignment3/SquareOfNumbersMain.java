package com.cg.lab7.assignment3;

import java.util.Scanner;

public class SquareOfNumbersMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		SquareOfNumbers obj=new SquareOfNumbers();
		System.out.println("Enter size of array");
		int sizeOfArray=sc.nextInt();
		int array[]=new int[sizeOfArray];
		System.out.println("Enter elements in the array");
		for(int indexOfArray=0;indexOfArray<sizeOfArray;indexOfArray++)
		{
			array[indexOfArray]=sc.nextInt();
		}
		System.out.println(obj.getSquares(array));
		sc.close();
	}
}
