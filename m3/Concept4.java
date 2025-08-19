package com.workspace.m3;
import java.util.Scanner;

public class Concept4 {

	public static void main(String[] args) 
	{
		UserData1 ud =Concept4.setValue();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the email : ");
		String s1= sc.nextLine();
		if(s1.equals(UserData1.userEmail)) 
		{
			System.out.print("enter the password :");
			String s2= sc .nextLine();
			if(s2.equals(UserData1.userPassword)) 
			{
				System.out.println("the patient details are : ");
				System.out.println(ud.userName);
				System.out.println(ud.userDiagnosis);
				System.out.println(ud.userDoctor);
				System.out.println(ud.userContact);
			}
			else 
			{
				System.out.println("invalid password");
			}
		}
		else 
		{
			System.out.println("email does not exist in database");
			System.out.println("create  user login Id");
		}
	}
	public static UserData1 setValue() 
	{
		UserData1 ud = new UserData1();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the user email : ");
		UserData1.userEmail=sc.nextLine();
		System.out.println();
		System.out.print("enter the password : ");
		UserData1.userPassword=sc.nextLine();
		System.out.println();
		System.out.print("enter the user name : ");
		ud.userName=sc.nextLine();
		System.out.println();
		System.out.print("enter the user contact : ");
		ud.userContact=sc.nextLine();
		System.out.println();
		System.out.print("enter the user diagnosis : ");
		ud.userDiagnosis=sc.nextLine();
		System.out.println();
		System.out.print("enter the doctor name : ");
		ud.userDoctor=sc.nextLine();
		System.out.println();
		return ud;
	}

}
class UserData1
{
	static String userEmail;
	static String userPassword;
	String userName;
	String userContact;
	String userDoctor;
	String userDiagnosis;
}

