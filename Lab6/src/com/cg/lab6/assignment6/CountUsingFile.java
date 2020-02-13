package com.cg.lab6.assignment6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountUsingFile {
	public int countLines(File file)
	{
		int noOfLines=0;
		try 
		{
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line=reader.readLine();
			while(line!=null)
			{
				noOfLines++;
				line=reader.readLine();
			}
			reader.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return noOfLines;
	}
	
	public int countWords(File file)
	{
		int noOfWords=0;
		try 
		{
			BufferedReader reader=new BufferedReader(new FileReader(file));
			StringBuilder sb=new StringBuilder();
			String line=reader.readLine();
			while(line!=null)
			{
				sb=sb.append(line);
				sb=sb.append(" ");
				line=reader.readLine();
			}
			String content=new String(sb);
			StringTokenizer st=new StringTokenizer(content);
			while(st.hasMoreTokens()!=false)
			{
				st.nextToken();
				noOfWords++;
			}

			reader.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return noOfWords;
	}
	
	public int countCharacters(File file)
	{
		int noOfCharacters=0;
		try 
		{
			FileReader reader=new FileReader(file);
			int i=reader.read();
			while(i!=-1)
			{
				noOfCharacters++;
				i=reader.read();
			}
			reader.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		CountUsingFile obj=new CountUsingFile();
		return noOfCharacters-(obj.countLines(file)-1)*2;
	}

}
