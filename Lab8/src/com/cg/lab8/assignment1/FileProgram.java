package com.cg.lab8.assignment1;

import java.io.File;
import java.util.Scanner;

public class FileProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter source file name");
		String sourceFileName=sc.nextLine();
		File sourceFile = new File(sourceFileName+".txt");
		System.out.println("Enter target file name");
		String targetFileName=sc.nextLine();
		File targetFile = new File(targetFileName+".txt");
		new CopyDataThread(sourceFile,targetFile);
		sc.close();
	}

}
