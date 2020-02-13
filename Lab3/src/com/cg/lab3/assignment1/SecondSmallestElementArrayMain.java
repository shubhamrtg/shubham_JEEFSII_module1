package com.cg.lab3.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElementArrayMain 
{

	public static void main(String[] args) 
	{
	    SecondSmallestElementArray object=new SecondSmallestElementArray();
	    Scanner scanObj=new Scanner(System.in);
	    System.out.println("Enter the size of array:");
	    int size=scanObj.nextInt();
	    int inputArray[]= new int[size];
	    for(int index=0;index<size;index++) 
	    {
		    System.out.println("Enter the "+index+" element of array:");
		    inputArray[index]=scanObj.nextInt();
	    }
	    System.out.println("the array is:"+Arrays.toString(inputArray));
	    System.out.println("The second smallest element in array is:"+object.getSecondSmallest(inputArray));
	    scanObj.close();
	}
}
