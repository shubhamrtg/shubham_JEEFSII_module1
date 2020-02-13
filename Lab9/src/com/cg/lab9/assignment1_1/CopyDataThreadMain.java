package com.cg.lab9.assignment1_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyDataThreadMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter source file name");
		String sourceFileName=sc.next();
		File sourceFile = new File(sourceFileName+".txt");
		System.out.println("Enter target file name");
		String targetFileName=sc.next();
		File targetFile = new File(targetFileName+".txt");
		CopyDataThread obj=new CopyDataThread(sourceFile,targetFile);
		ExecutorService executor=Executors.newSingleThreadExecutor();
		Runnable task=()->{
			System.out.println(Thread.currentThread()+" thread is running");
			try
			{
				
				File source = obj.source;
				File target = obj.target;
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
						Thread.sleep(5000);
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
		};
		executor.execute(task);
		sc.close();
		executor.shutdown();
	}

}
