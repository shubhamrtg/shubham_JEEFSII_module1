package com.cg.lab9.assignment1_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DisplayTimerMain 
{
	public static void main(String...args)
	{
		ExecutorService executor= Executors.newSingleThreadExecutor();
		Callable<Integer> task=()->{
			Date d = new Date();
		    SimpleDateFormat simpDate;
		    simpDate = new SimpleDateFormat("kk:mm:ss");
			try
			{
				int count=10;
				while(count-->0)
				{
					System.out.println(simpDate.format(d));
					Thread.sleep(1000);
					d = new Date();
				}
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			return 1;
		};
		Future<Integer> future=executor.submit(task);
		try 
		{
			if(future.get()==1)
				System.out.println("Timer ended");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		} catch (ExecutionException e) 
		{
			e.printStackTrace();
		}
	}
}
