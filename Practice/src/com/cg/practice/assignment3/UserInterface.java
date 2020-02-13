package com.cg.practice.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int noOfProducts=sc.nextInt();
		String products[]=new String[noOfProducts];
		for(int i=0;i<noOfProducts;i++)
		{
			products[i]=sc.next();
		}
		List<Shopping> shoppingList=new ArrayList<Shopping>();
		double minDiscount=Integer.MAX_VALUE;
		for(int i=0;i<noOfProducts;i++)
		{
			Shopping obj=new Shopping();
			obj.parseData(products[i]);
			shoppingList.add(obj);
			if(obj.getDiscountedAmount()<minDiscount)
			{
				minDiscount=obj.getDiscountedAmount();
			}
		}
		for(Shopping i:shoppingList)
		{
			if(i.getDiscountedAmount()==minDiscount)
			{
				System.out.println(i.getProduct()+" "+i.getDiscountedAmount());
			}
		}
		sc.close();
	}
}
