package com.kodewala.akanksha;
import java.util.Scanner;

public class Employee1 {
	String empName;
	String empId;
	String empDep;

	public  Employee1() 
	{
		this(45);
		System.out.println("the name of employee is : "+this.empName);
		System.out.println("the Id of employee is : "+this.empId);
	}
	public  Employee1(int x) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee name and Id : ");
		this.empName=sc.nextLine();
		this.empId=sc.nextLine();
	}
	public Employee1(boolean b)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the department : ");
		this.empDep=sc.nextLine();
	}

	public static void main(String[] args) 
	{
		Employee1  emp= new  Employee1(); 
		Manager1 m1= new Manager1();
	}

}
