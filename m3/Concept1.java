package com.workspace.m3;
import java.util.Scanner;

public class Concept1 {

	public static void main(String[] args)
	{
		Concept1 c1= new Concept1();
		Concept1Data c= c1.setData();
		System.out.println("details of the candidate is :");
		System.out.println(c.userName);
		System.out.println(c.userEmail);
		System.out.println(c.userContact);
	}
	public Concept1Data setData() 
	{
		Concept1Data cd= new Concept1Data();
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter the user name : ");
		cd.userName=scanner.nextLine();
		System.out.println();
		System.out.print("enter the user email : ");
		cd.userEmail=scanner.nextLine();
		System.out.println();
		System.out.print("enter the user contact number : ");
		cd.userContact=scanner.nextLine();
		System.out.println();
		return cd;
	}

}
class Concept1Data {
	String userName;
	String userEmail;
	String userContact;

}

