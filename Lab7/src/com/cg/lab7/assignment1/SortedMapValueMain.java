package com.cg.lab7.assignment1;

import java.util.HashMap;
import java.util.Scanner;

public class SortedMapValueMain 
{

	public static void main(String[] args) 
	{
		SortedMapValue obj=new SortedMapValue();
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		System.out.println("Enter Key and Values in the map.. Press q to quit");
		String key="";
		while(true)
		{
			key=sc.next();
			if((key.equalsIgnoreCase("q"))==true)
				break;
			int value=sc.nextInt();
			map.put(key,value);
		}
		System.out.println(obj.sortValues(map));
		sc.close();
	}

}
