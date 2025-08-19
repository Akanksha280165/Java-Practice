package com.workspace.m3;
import java.util.Scanner;
public class Concept3 
	{
	public static void main(String[] args) 
	{
		Concept3 c1= new Concept3();
		UserData ud =c1.setValue();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the user email : ");
		String s1=sc.nextLine();
		
		if(s1.equals(UserData.userEmail)) {
			System.out.println("enter the user password");
			String s2=sc.nextLine();
			if(s2.equals(UserData.userPassword)) {
				System.out.println("user details are :");
				System.out.println(ud.userName);
				System.out.println(ud.userContact);
				//break;
			}
			else
			{
				System.out.println("invalid password ");
			}
		}
		else {
			System.out.println(" email does not exist ");
			//break;
		}
	}
	public UserData setValue() 
	{
		Scanner sc = new Scanner(System.in);
		UserData ud = new UserData();
		System.out.print("enter the user email : ");
		UserData.userEmail=sc.nextLine();
		System.out.println();
		System.out.print("enter the password : ");
		UserData.userPassword=sc.nextLine();
		System.out.println();
		System.out.print("enter the user name : ");
		ud.userName=sc.nextLine();
		System.out.println();
		System.out.print("enter the contact : ");
		ud.userContact=sc.nextLine();
		System.out.println();
		return ud;
	}
}
class UserData
{
	String userName;
	static String userEmail;
	static String userPassword;
	String userContact;
}
