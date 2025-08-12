package com.kodewala.akanksha;

import java.util.Scanner;

public class Calculator {
	int x,y;
	double a,b;
	public Calculator() 
	{
		this("Addition");
		int result1=x+y;
		System.out.print(result1);
	}
	public Calculator(String operation) 
	{
		Scanner  sc = new  Scanner(System.in);
		System.out.print("enter the numbers u want  : ");
		this.x=sc.nextInt();
		this.y=sc.nextInt();
		System.out.print("the result after "+operation+" is :");
	}
	public Calculator(boolean b) 
	{
		this(56);
		int result2=x*y;
		System.out.print(result2);
	}
	public Calculator(int x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the numbers u want :");
		this.x=sc.nextInt();
		this.y=sc.nextInt();
		System.out.print("the result after multiplication is :");
	}
	public Calculator(double d)
	{
		this('c');
		double result3=a/b;
		System.out.print(result3);
	}
	public Calculator(char c) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number u want : ");
		this.a=sc.nextDouble();
		this.b=sc.nextDouble();
		System.out.print("the result after division is :");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the operation : ");
		String s1=sc.nextLine();
		if(s1.equals("addition")) 
		{
			Calculator c1= new Calculator();
		}
		else if(s1.equals("multiply")) 
		{
			Calculator c2= new  Calculator(true);
		}
		else if(s1.equals("division")) 
		{
			Calculator c3= new  Calculator(56.67d);
		}
		else 
		{
			System.out.println("enter valid input");
		}
	}
	

}
