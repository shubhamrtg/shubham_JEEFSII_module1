package com.cg.lab7.assignment3;

import java.util.HashMap;

public class SquareOfNumbers 
{
	public HashMap<?,?> getSquares(int array[])
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int a: array)
		{
			map.put(a, a*a);
		}
		return map;
	}

}
