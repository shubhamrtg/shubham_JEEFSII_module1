package com.cg.lab5.assignment1;

import java.util.Scanner;

public class TrafficLightsMain 
{
	public static void main(String[] args) 
	{
		TrafficLights object=new TrafficLights();
		Scanner scanObj=new Scanner(System.in);
		System.out.println("1.Red\n2.Yellow\n3.Green\n0.Exit");
		int inputNumber=scanObj.nextInt();
		object.showMessage(inputNumber);
		while(inputNumber!=0) 
		{
			object.showMessage(inputNumber);
			System.out.println("1.Red\n2.Yellow\n3.Green\n0.Exit");
			inputNumber=scanObj.nextInt();	
		}
		scanObj.close();
	}
}
