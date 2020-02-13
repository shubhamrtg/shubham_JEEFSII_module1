package com.cg.lab7.assignment4;

import java.util.HashMap;

public class StudentMarks 
{
	public HashMap<?,?> getStudents(HashMap<Integer,Integer> students)
	{
		HashMap<Integer,String> medals=new HashMap<Integer,String>();
		for(Integer marks:students.keySet())
		{
			if(students.get(marks)>=90)
				medals.put(marks,"Gold");
			else if(students.get(marks)>=80 && students.get(marks)<90)
				medals.put(marks,"Silver");
			else if(students.get(marks)>=70 && students.get(marks)<80)
				medals.put(marks,"Bronze");
			else if(students.get(marks)<70)
				medals.put(marks,"NA");
		}
		return medals;
	}
}
