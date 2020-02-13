package com.cg.lab6.assignment6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountUsingFileMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		CountUsingFile obj=new CountUsingFile();
		System.out.println("Enter file name");
		String fileName=sc.nextLine();
		File file = new File(fileName+".txt");
	    try 
	    {
			if(file.createNewFile())
			    System.out.println("File created: " + file.getName());
			else
				System.out.println("Cannot create file");
		} 
	    catch (IOException e) 
	    {
			System.out.println(e);;
		}
	    System.out.println(obj.countLines(file));
	    System.out.println(obj.countWords(file));
	    System.out.println(obj.countCharacters(file));
	    sc.close();
	}

}
