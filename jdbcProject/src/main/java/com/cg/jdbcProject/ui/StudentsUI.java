package com.cg.jdbcProject.ui;

import java.util.List;

import com.cg.jdbcProject.dto.Students;
import com.cg.jdbcProject.service.StudentService;

public class StudentsUI 
{
	public static void main(String[] args) 
	{
		StudentService studentObj=new StudentService();
		
		/*studentBean.setFirstName("Dustbin");
		studentBean.setLastName("Sharma");
		studentBean.setAge(34);
		studentBean.setStudentID(1165);
		Students studentBean=new Students();
		boolean result=studentObj.registerStudentService(studentBean);
		if(result)
		{
			System.out.println("Data inserted into table");
		}
		else
		{
			System.out.println("Error occured while inserting row");
		}*/
		
		List<Students> listOfStudents= studentObj.displayStudentService(24);
		for(Students ob:listOfStudents)
		{
			System.out.println("Student ID : "+ob.getStudentID()+"\t Name : "+ob.getFirstName()+" "+ob.getLastName()+"\t Age : "+ob.getAge());
		}
	}

}
