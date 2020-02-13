package com.cg.lab1.assignment1;

import java.util.Scanner;

public class CalculateSumMain 
{
	public static void main(String[] args) 
	{
		CalculateSum object=new CalculateSum();
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter the number:");
		int inputNumber=scanObj.nextInt();
		System.out.println("The sum is:"+object.calculateSum(inputNumber));
        scanObj.close();
	}

}
