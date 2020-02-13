package com.cg.lab3.assignment3;

import java.util.Scanner;

public class ReversedSortedArrayMain 
{
	public static void main(String[] args) 
	{
	    ReversedSortedArray object=new ReversedSortedArray();
	    Scanner scanObj=new Scanner(System.in);
	    System.out.println("Enter the size of array:");
	    int size=scanObj.nextInt();
	    int inputArray[]=new int[size];
	    for(int index=0;index<size;index++) 
	    {
		    System.out.println("Enter the "+index+" element of array");
		    inputArray[index]=scanObj.nextInt();
	    }
	    inputArray=object.getSorted(inputArray);
	    for(int index:inputArray) 
	    {
		    System.out.println(index);
	    }
	    scanObj.close();
	}
}
