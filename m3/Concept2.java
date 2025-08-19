package com.workspace.m3;
import java.util.Scanner;

public class Concept2 {

	public static void main(String[] args) 
	{
		Concept2 c1= new Concept2();
		String s =c1.getData();
		if(s.equals(null)) {
		System.out.println("the data is taken");
		}
	}
	public String getData() 
	{
		UserDetails  userdetails = new  UserDetails();
		Scanner scanner = new  Scanner(System.in);
		System.out.print("enter the user name : ");
		userdetails.userName=scanner.nextLine();
		System.out.println();
		System.out.print("enter the user email : ");
		userdetails.userEmail=scanner.nextLine();
		System.out.println();
		System.out.print("enter the user contact : ");
		userdetails.userContact=scanner.nextLine();
		System.out.println();
		return null;
		
	}

}
class UserDetails
{
	String userName;
	String userEmail;
	String userContact;
}
