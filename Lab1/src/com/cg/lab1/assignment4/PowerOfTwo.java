package com.cg.lab1.assignment4;

public class PowerOfTwo 
{
    public boolean chechNumber(int n) 
    {
	    if((n&(n-1))==0) 
	    {
		    return true;
	    }
	    else 
	    {
		    return false;
	    }
    }
}
