package com.cg.lab6.assignment7;

import java.util.Scanner;

public class FileInformationMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the file");
		String fileName=sc.next()+".txt";
		FileInformation obj=new FileInformation();
		obj.displayInformation(fileName);
		sc.close();
	}

}
