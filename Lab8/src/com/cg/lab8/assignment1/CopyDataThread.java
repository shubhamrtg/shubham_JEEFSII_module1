package com.cg.lab8.assignment1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread
{
	File source, target;
	CopyDataThread(File source,File target)
	{
		super("copy data thread");
		this.source=source;
		this.target=target;
		start();
	}
	
	public void run()
	{
		System.out.println(this+" thread is running");
		try
		{
			FileReader fr=new FileReader(source);
			FileWriter fw=new FileWriter(target);
			int content=fr.read();
			int count=10;
			while(content!=-1)
			{
				if(count>0)
				{
					
					fw.write(content);
					content=fr.read();
					count--;
				}
				else
				{
					System.out.println("10 characters copied");
					count=10;
					sleep(5000);
				}
			}
			fw.close();
			fr.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Content copied from source to target file");
	}

}
