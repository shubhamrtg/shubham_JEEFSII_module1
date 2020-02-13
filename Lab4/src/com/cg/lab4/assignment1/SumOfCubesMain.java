package com.cg.lab4.assignment1;

import java.util.Scanner;

public class SumOfCubesMain 
{
	public static void main(String[] args) 
	{
		SumOfCubes object=new SumOfCubes();
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter the number:");
		int inputNumber=scanObj.nextInt();
		System.out.println("The sum is:"+object.sumOfCubes(inputNumber));
		scanObj.close();
	}
}
