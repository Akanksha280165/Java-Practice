package com.kodewala.akanksha;

import java.util.Scanner;

public class StudentDetails {
	String stuName;
	String stuId;
	String stuDep;
	public StudentDetails(int x) 
	{
		this("abc");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the student department : ");
		this.stuDep=sc.nextLine();
	}
	public StudentDetails(String s1)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the student name and Id : ");
		this.stuName=sc.nextLine();
		this.stuId=sc.nextLine();
	}
	public StudentDetails() 
	{
		this(56);
		System.out.println("the student name is : "+this.stuName);
		System.out.println("the student Id is : "+this.stuId);
		System.out.println("the student department is : "+this.stuDep);
	}

	public static void main(String[] args) 
	{
		SchoolData sd= new SchoolData();
		StudentDetails sd1=new StudentDetails();
	}

}
