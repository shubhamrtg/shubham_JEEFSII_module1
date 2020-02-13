package com.cg.lab3.assignment3;

import java.util.Arrays;

public class ReversedSortedArray 
{
    public int[] getSorted(int array[]) 
    {
	    int reverse=0,arrayIndex=0,digit=0;
	    for(int arrayElement:array) 
	    {
		    reverse=0;
		    while(arrayElement>0) 
		    {
		        digit=arrayElement%10;
			    reverse=reverse*10+digit;
			    arrayElement=arrayElement/10;
		    }
		    array[arrayIndex]=reverse;
		    arrayIndex++;
	    }
	    Arrays.sort(array);
	    return array;
    }
}
