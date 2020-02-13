package com.cg.lab8.assignment2;

public class DisplayTimerMain 
{
	public static void main(String[] args) 
	{
		DisplayTimer ob=new DisplayTimer("Thread 1");
		try 
		{
			ob.t.join();
			System.out.println("running main thread after timer thread function");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
