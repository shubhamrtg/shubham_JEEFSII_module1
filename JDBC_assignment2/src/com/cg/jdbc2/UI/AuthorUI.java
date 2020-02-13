package com.cg.jdbc2.UI;

import java.util.List;
import java.util.Scanner;

import com.cg.jdbc2.DTO.Author;
import com.cg.jdbc2.services.AuthorServices;

public class AuthorUI 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		AuthorServices authorObject=new AuthorServices();
		System.out.println("Enter 1 to enter new author, 2 to update Existing author, 3 to delete, 4 to view all authors and 0 to exit");
		int ch=sc.nextInt();
		while(ch!=0)
		{
			Author authorBean=new Author();
			switch(ch)
			{
			case 1:
				System.out.println("Enter details of author");
				
				authorBean.setAuthorID(sc.nextInt());
				authorBean.setFirstName(sc.next());
				authorBean.setMiddleName(sc.next());
				authorBean.setLastName(sc.next());
				authorBean.setPhoneNumber(sc.nextLong());
				if(authorObject.inserAuthorService(authorBean))
				{
					System.out.println("author added");
				}
				else
				{
					System.out.println("failed to add author");
				}
				break;
			case 2:
				System.out.println("enter author id");
				authorBean.setAuthorID(sc.nextInt());
				System.out.println("Enter updated details of author");
				authorBean.setFirstName(sc.next());
				authorBean.setMiddleName(sc.next());
				authorBean.setLastName(sc.next());
				authorBean.setPhoneNumber(sc.nextLong());
				if(authorObject.updateAuthorService(authorBean))
				{
					System.out.println("author updated");
				}
				else
				{
					System.out.println("failed to update author");
				}
				break;
			case 3:
				System.out.println("enter author id");
				authorBean.setAuthorID(sc.nextInt());
				if(authorObject.deleteAuthorService(authorBean.getAuthorID()))
				{
					System.out.println("author deleted");
				}
				else
				{
					System.out.println("failed to delete author");
				}
				break;
			case 4:
				List<Author> listOfAuthors= authorObject.displayAuthorService();
				for(Author ob:listOfAuthors)
				{
					System.out.println("authorID=" + ob.getAuthorID() + ", firstName=" + ob.getFirstName() + ", middleName=" + ob.getMiddleName()+ ", lastName=" + ob.getLastName()+ ", phoneNumber=" + ob.getPhoneNumber());
				}
			default:
				System.out.println("GO HOME YOU ARE DRUNK..!!");
			}
			System.out.println("Enter 1 to enter new author, 2 to update Existing author, 3 to delete, 4 to view all authors and 0 to exit");
			ch=sc.nextInt();
		}
		sc.close();
	}

}
