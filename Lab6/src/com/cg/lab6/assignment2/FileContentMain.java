package com.cg.lab6.assignment2;

import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileContentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileContent obj=new FileContent();
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
//	    System.out.println("Enter number of lines");
//	    int n=sc.nextInt();
//	    String content;
//	    System.out.println("Enter content in the file");
//	    
//	    try 
//	    {
//			FileWriter writer=new FileWriter(file);
//			for(int i=0;i<=n;i++)
//		    {
//		    	content=sc.nextLine();	
//		    	writer.write(content);
//		    }
//			writer.close();
//		} 
//	    catch (IOException e) 
//	    {
//			e.printStackTrace();
//		}
	    obj.readFile(file);
	    sc.close();
	}
}
