package com.cg.lab4.assignment1;

public class SumOfCubes 
{
    public int sumOfCubes(int number) 
    {
	    int digit=0,sum=0;
	    while(number>0) 
	    {
		    digit=number%10;
		    sum=sum+digit*digit*digit;
		    number=number/10;
	    }
	    return sum;
    }
}
