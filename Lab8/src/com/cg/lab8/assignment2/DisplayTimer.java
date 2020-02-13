package com.cg.lab8.assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayTimer implements Runnable
{
	Thread t;
	
	public DisplayTimer(String name)
	{
		t=new Thread(this,name);
		t.start();
	}
	
	public void run()
	{
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
	}
}
