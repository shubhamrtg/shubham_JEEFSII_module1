package com.cg.jdbc2.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.jdbc2.DTO.Author;

public class AuthorDAO 
{
	Connection con;
	PreparedStatement insert;
	PreparedStatement update;
	PreparedStatement delete;
	PreparedStatement select;
	ResultSet result;
	public AuthorDAO()
	{
		con=DBConnection.getDBConnection();
	}
	
	public boolean insertAuthorDAO(Author authorBean)
	{
		try 
		{
			insert=con.prepareStatement("insert into author value(?,?,?,?,?)");
			insert.setInt(1, authorBean.getAuthorID());
			insert.setString(2, authorBean.getFirstName());
			insert.setString(3, authorBean.getMiddleName());
			insert.setString(4, authorBean.getLastName());
			insert.setLong(5, authorBean.getPhoneNumber());
			int result=insert.executeUpdate();
			if(result>0)
			{
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
	public boolean updateAuthorDAO(Author authorBean)
	{
		try 
		{
			update=con.prepareStatement("update author set firstName=?, middleName=?, lastName=?, phoneNumber=? where authorId=?");
			update.setString(1, authorBean.getFirstName());
			update.setString(2, authorBean.getMiddleName());
			update.setString(3, authorBean.getLastName());
			update.setLong(4, authorBean.getPhoneNumber());
			update.setInt(5, authorBean.getAuthorID());
			int result=update.executeUpdate();
			if(result>0)
			{
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
	public boolean deleteAuthorDAO(int authorID)
	{
		try 
		{
			delete=con.prepareStatement("delete from author where authorId=?");
			delete.setInt(1, authorID);
			int result=update.executeUpdate();
			if(result>0)
			{
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
	public ArrayList<Author> displayAuthorDAO()
	{
		ArrayList<Author> listOfAuthors=new ArrayList<Author>();
		try 
		{
			select=con.prepareStatement("Select * from author");
			result=select.executeQuery();
			while(result.next())
			{
				Author authorBean=new Author();
				authorBean.setAuthorID(result.getInt(1));
				authorBean.setFirstName(result.getString(2));
				authorBean.setMiddleName(result.getString(3));
				authorBean.setLastName(result.getString(4));
				authorBean.setPhoneNumber(result.getLong(5));
				
				listOfAuthors.add(authorBean);
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return listOfAuthors;
	}
}
