package com.cg.jdbcProject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public static Connection getDBConnection()
	{
		Connection con=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded!");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","database","database");
			if(con!=null)
			{
				System.out.println("Connection Established!");
				con.setAutoCommit(false);
			}
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		
		return con;
	}
}
