package com.cg.lab1.assignment2;

import java.util.Scanner;

public class DifferenceMain 
{
	public static void main(String[] args) 
	{
		Difference object=new Difference();
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter the number:");
		int inputNumber=scanObj.nextInt();
		System.out.println("The difference is:"+object.calculateDifference(inputNumber));
		scanObj.close();
	}

}
