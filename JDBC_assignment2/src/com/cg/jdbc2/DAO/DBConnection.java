package com.cg.jdbc2.DAO;

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
			System.out.println("Driver loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			if(con!=null)
			{
				System.out.println("Connection Established!");
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println(e);
		}
		return con;
	}
}
