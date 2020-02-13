package com.cg.lab1.assignment2;

public class Difference 
{
    public int calculateDifference(int n) 
    {
	    int sum=0,sumOfNumbers=0,squareOfSum=0,sumOfSquares=0;
	    for(int index=0;index<n;index++) 
	    {
		    sumOfNumbers=sumOfNumbers+index;
		    sumOfSquares=sumOfSquares+index*index;
	    }
	    squareOfSum=sumOfNumbers*sumOfNumbers;
	    sum=sumOfSquares-squareOfSum;
	    return sum; 
    }
}
