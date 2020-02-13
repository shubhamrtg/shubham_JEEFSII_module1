package com.cg.lab3.assignment4;

import java.util.Scanner;

public class OccurenceOfCharacterMain 
{
	public static void main(String[] args) 
	{
	    OccurenceOfCharacter object=new OccurenceOfCharacter();
	    Scanner scanObj=new Scanner(System.in);
	    System.out.println("Enter the string:");
	    String inputString=scanObj.next();
	    object.countOccurence(inputString);
	    scanObj.close();
	}

}
