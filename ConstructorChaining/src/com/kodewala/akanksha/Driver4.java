package com.kodewala.akanksha;
import java.util.Scanner;

public class Driver4 {
	String name , instituteName;
	
	public Driver4() 
	{
		this(101323);
		System.out.println("the student name is "+name);
	}
	
	public Driver4(long x) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the student name :");
		this.name=sc.nextLine();
		System.out.println("the student id is "+x);
	}
	public Driver4(String s)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the student institute :");
		this.instituteName=sc.nextLine();
		System.out.println(s);
	}
	public Driver4(boolean b) 
	{
		this("maa i love you");
		System.out.println("the student institute is "+instituteName);
	}
	public static void main(String[] args) 
	{
		Driver4 d1= new Driver4();
		System.out.println("***first operation finish***");
		Driver4 d2= new Driver4(true);
		System.out.println("***2nd operation finish***");
	}
}
