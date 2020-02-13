package com.cg.jdbc2.services;

import java.util.ArrayList;

import com.cg.jdbc2.DAO.AuthorDAO;
import com.cg.jdbc2.DTO.Author;

public class AuthorServices 
{
	AuthorDAO authorObject=new AuthorDAO();
	public boolean inserAuthorService(Author authorBean)
	{
		return authorObject.insertAuthorDAO(authorBean);
	}
	public boolean updateAuthorService(Author authorBean)
	{
		return authorObject.updateAuthorDAO(authorBean);
	}
	public boolean deleteAuthorService(int authorID)
	{
		return authorObject.deleteAuthorDAO(authorID);
	}
	public ArrayList<Author> displayAuthorService()
	{
		return authorObject.displayAuthorDAO();
	}
}
