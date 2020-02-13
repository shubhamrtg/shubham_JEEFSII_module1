package com.cg.practice.assignment2;

import java.util.Scanner;

public class UserInterface
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of products");
		int n=sc.nextInt();
		Shop obj=new Shop();
		System.out.println("Enter product details : Serial number and name");
		for(int i=0;i<n;i++)
		{
			int serialNumber=sc.nextInt();
			String productName=sc.next();
			obj.addProductDetail(serialNumber,productName);
		}
		System.out.println("Enter product type");
		String productType=sc.next();
		System.out.println(obj.searchBasedOnProduct(productType));
		sc.close();
	}

}
