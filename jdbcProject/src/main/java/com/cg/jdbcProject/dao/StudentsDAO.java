package com.cg.jdbcProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.jdbcProject.dto.Students;

public class StudentsDAO 
{
	Connection con;
	PreparedStatement psInsert;
	PreparedStatement psSelect;
	ResultSet result;
	
	public StudentsDAO()
	{
		con=DBConnection.getDBConnection();
	}

	public boolean registerStudentDAO(Students studentBean)
	{
		try 
		{
			psInsert=con.prepareStatement("Insert into students values(?,?,?,?)");
			psInsert.setInt(1, studentBean.getStudentID());
			psInsert.setString(2, studentBean.getFirstName());
			psInsert.setString(3, studentBean.getLastName());
			psInsert.setInt(4, studentBean.getAge());
			
			int result=psInsert.executeUpdate();
			if(result>0)
			{
				con.commit();
				return true;
			}
			else
				return false;
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
			return false;
		}
	}
	
	public ArrayList<Students> displayStudentDAO(int age)
	{
		ArrayList<Students> listOfStudents=new ArrayList<Students>();
		try 
		{
			psSelect=con.prepareStatement("Select * from students where age < ?");
			psSelect.setInt(1, age);
			
			result=psSelect.executeQuery();
			while(result.next())
			{
				Students studentBean=new Students();
				studentBean.setStudentID(result.getInt(1));
				studentBean.setFirstName(result.getString(2));
				studentBean.setLastName(result.getString(3));
				studentBean.setAge(result.getInt(4));
				
				listOfStudents.add(studentBean);
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return listOfStudents;
	}
}
