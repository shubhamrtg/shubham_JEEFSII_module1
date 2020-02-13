package com.cg.lab7.assignment6;

import java.util.HashMap;
import java.util.Scanner;


public class EligibleToVoteMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EligibleToVote obj=new EligibleToVote();
		HashMap<String,Integer> list=new HashMap<String,Integer>();
		System.out.println("Enter Name and age... Press q to quit");
		String key="";
		while(true)
		{
			key=sc.next();
			if((key.equalsIgnoreCase("q"))==true)
				break;
			list.put(key,sc.nextInt());
		}
		System.out.println(obj.voterList(list));
		sc.close();
	}

}
