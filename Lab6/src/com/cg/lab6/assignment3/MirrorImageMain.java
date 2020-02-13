package com.cg.lab6.assignment3;

import java.util.Scanner;

public class MirrorImageMain 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a stirng");
		String s= sc.nextLine();
		MirrorImage obj=new MirrorImage();
		System.out.println(obj.getImage(s));
		sc.close();
	}

}
