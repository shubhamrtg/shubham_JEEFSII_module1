package com.cg.jdbcProject.dto;

public class Students 
{
	private int studentID, age;
	private String firstName, lastName;
	
	public Students() 
	{
		super();
	}

	public int getStudentID() 
	{
		return studentID;
	}

	public void setStudentID(int studentID) 
	{
		this.studentID = studentID;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
}
