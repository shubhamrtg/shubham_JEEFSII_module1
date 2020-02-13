package com.cg.jdbcProject.service;

import java.util.ArrayList;

import com.cg.jdbcProject.dao.StudentsDAO;
import com.cg.jdbcProject.dto.Students;

public class StudentService 
{
	StudentsDAO studentObj=new StudentsDAO();
	public boolean registerStudentService(Students studentBean)
	{
		if(studentBean.getAge()>18)
		{
			boolean result = studentObj.registerStudentDAO(studentBean);
			return result;
		}
		else
		{
			System.out.println("Age should be greater than 18");
			return false;
		}
	}
	
	public ArrayList<Students> displayStudentService(int age)
	{
		return studentObj.displayStudentDAO(age);
	}
}
