package com.workspace.m3;
import java.util.Scanner;

public class MethodC2 {
	Double n1;
	Double n2;
	Double result;
	String operation;
	public static void main(String[] args) 
	{
		MethodC2 m1= new  MethodC2();
		Operations op= new Operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers ");
		m1.n1=sc.nextDouble();
		m1.n2=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter the operation ");
		m1.operation=sc.next();
		if(m1.operation.equals("add")) 
		{
			m1.result=op.add(m1.n1,m1.n2);
			System.out.print("the result after addition is :"+m1.result);
		}
		else if(m1.operation.equals("multiply")) 
		{
			m1.result=op.multiply(m1.n1,m1.n2);
			System.out.print("the result after multiplication is :"+m1.result);
			
		}
		else if(m1.operation.equals("subtract")) 
		{
			m1.result=op.subtract(m1.n1,m1.n2);
			System.out.print("the result after subtraction  is :"+m1.result);
		}
		else if(m1.operation.equals("divide"))
		{
			m1.result=op.divide(m1.n1,m1.n2);
			System.out.print("the result after division is :"+m1.result);
		}
		else 
		{
			System.out.print("invalid input");
		}
	}
}
	class Operations
	{
		public double add(double a, double b) 
		{
			double r=a+b;
			return r;
		}
		public double multiply(double a, double b) 
		{
			double r=a*b;
			return r;
		}
		public double subtract(double a, double b)
		{
			double r=a-b;
			return r;
		}
		public double divide(double a, double b) 
		{
			double r= a/b;
			return r;
		}
	}
