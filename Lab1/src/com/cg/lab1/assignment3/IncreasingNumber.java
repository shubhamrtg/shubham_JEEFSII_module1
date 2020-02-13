package com.cg.lab1.assignment3;

public class IncreasingNumber 
{
    public boolean checkNumber(int number) 
    {
	    int digit1=0,digit2=0;
	    while(number>0) 
	    {
		    digit1=number%10;
		    number=number/10;
		    digit2=number%10;
		    if(digit1<digit2) 
		    {
			    return false;
		    }
	    }
	    return true;
    }
}
