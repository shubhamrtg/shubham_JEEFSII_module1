package com.cg.lab7.assignment5;

import java.util.ArrayList;
import java.util.Collections;

public class SecondSmallest 
{
	public int sortValues(int array[])
	{
		ArrayList<Integer> newArray=new ArrayList<Integer>();
		for(int value:array)
		{
			newArray.add(value);
		}
		Collections.sort(newArray);
		return newArray.get(1);	
	}

}
