package com.cg.lab3.assignment1;

public class SecondSmallestElementArray 
{ 
    public int getSecondSmallest(int array[]) 
    {
	    int temp=0;
	    for(int index=0;index<array.length;index++) 
	    {
		    for(int index2=0;index2<array.length-1;index2++) 
		    {
			    if(array[index2]>array[index2+1]) 
			    {
				    temp=array[index2];
				    array[index2]=array[index2+1];
				    array[index2+1]=temp;	
			    }
		    }
	    }
	    return array[1];
    }
}
