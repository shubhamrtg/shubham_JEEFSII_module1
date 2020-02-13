package com.cg.lab6.assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileContent {
	public void readFile(File file)
	{
		int i=1;
		try 
		{
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line=reader.readLine();
			while(line!=null)
			{
				System.out.println((i++)+". "+line);
				line=reader.readLine();
			}
			reader.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}

}
