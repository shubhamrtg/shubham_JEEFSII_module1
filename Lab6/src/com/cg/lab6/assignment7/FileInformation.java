package com.cg.lab6.assignment7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInformation 
{

	public void displayInformation(String fileName)
	{
		try
		{
			FileReader fr=new FileReader(fileName);
			File file=new File(fileName);
			System.out.println("File exists");
			System.out.println("File is readable : "+file.canRead());
			System.out.println("File is writeable : "+file.canWrite());
			System.out.println("Type of file : "+file.getName());
			System.out.println("Length of file : "+file.length());
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("File does not exist");
		}
	}
}
