package com.cg.lab1.assignment3;

import java.util.Scanner;

public class IncreasingNumberMain 
{
	public static void main(String[] args) 
	{
		IncreasingNumber object=new IncreasingNumber();
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter the number:");
		int inputNumber=scanObj.nextInt();
		System.out.println(object.checkNumber(inputNumber));
		scanObj.close();
	}

}
