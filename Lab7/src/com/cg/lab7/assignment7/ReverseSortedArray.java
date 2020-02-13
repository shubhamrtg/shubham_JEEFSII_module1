package com.cg.lab7.assignment7;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSortedArray 
{
	public int[] getSorted(int array[])
	{
		ArrayList<Integer> newArray=new ArrayList<Integer>();
		for(int element:array)
		{
			int reverse=0,digit;
			while(element>0)
			{
				digit=element%10;
				reverse=reverse*10+digit;
				element=element/10;
			}
			newArray.add(reverse);
		}
		Collections.sort(newArray);
		int index=0;
		for(Integer value:newArray)
		{
			array[index]=value;
			index++;
		}
		return array;
	}
}
