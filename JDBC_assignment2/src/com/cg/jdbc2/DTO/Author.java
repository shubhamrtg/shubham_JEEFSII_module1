package com.cg.jdbc2.DTO;

public class Author 
{
	private int authorID;
	private String firstName, middleName, lastName;
	private long phoneNumber;
	
	public Author() 
	{
		super();
	}
	public int getAuthorID() 
	{
		return authorID;
	}
	public void setAuthorID(int authorID) 
	{
		this.authorID = authorID;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getMiddleName() 
	{
		return middleName;
	}
	public void setMiddleName(String middleName) 
	{
		this.middleName = middleName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public long getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	
}
