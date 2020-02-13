package com.cg.lab10.assignment1;

import java.util.Scanner;

public class CalculatePower 
{
	public static void main(String...args)
	{
		PowerInterface object;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x");
		int x=sc.nextInt();
		System.out.println("Enter value of y");
		int y=sc.nextInt();
		object=(x1,y1)->Math.pow(x1, y1);
		System.out.println(x+" raised to power "+y+" = "+object.powerOf(x, y));
		sc.close();
	}

	@Override
	public String toString() {
		return "CalculatePower [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
