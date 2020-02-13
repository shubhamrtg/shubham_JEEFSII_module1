package com.cg.lab10.assignment3;

public interface UserAuthentication 
{
	String defaultUserName="shubham";
	String defaultPassword="hellothere";
	public boolean authenticateUser(String userName, String password);

}
