package com.cg.lab7.assignment8;

import java.util.TreeSet;

public class RemoveDuplicates 
{
	public int[] modifyArray(int array[])
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int element: array)
		{
			ts.add(element);
		}
		ts=(TreeSet<Integer>) ts.descendingSet();
		int newArray[]=new int[ts.size()];
		int index=0;
		for(Integer value: ts)
		{
			newArray[index++]=value;
		}
		return newArray;
	}

}
