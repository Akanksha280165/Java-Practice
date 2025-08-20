package com.workspace.m2;
import java.util.Scanner;

public class MethodC1 {
	Double number1;
	Double number2;
	Double result;
	String operation;

	public static void main(String[] args)
	{
		MethodC1  m1= new MethodC1();
		Scanner sc= new  Scanner(System.in);
		System.out.print("enter the 2 number for operation :");
		m1.number1=sc.nextDouble();
		m1.number2=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter the operation :");
		m1.operation=sc.nextLine();
		if((m1.operation.equals("add"))) 
		{
			m1.result=m1.add(m1.number1, m1.number2);
			System.out.println(m1.result);
		}
		else if(m1.operation.equals("multiply")) 
		{
			m1.result=m1.multiply(m1.number1, m1.number2);
			System.out.println(m1.result);
		}
		else if(m1.operation.equals("subtract")) 
		{
			m1.result=m1.subtract(m1.number1, m1.number2);
			System.out.println(m1.result);
		}
		else if(m1.operation.equals("division")) 
		{
			m1.result=m1.division(m1.number1, m1.number2);
			System.out.println(m1.result);
		}
		else
		{
			System.out.println("invalid input");
		}
	}
	public double add(double a,double b) 
	{
		double r=a+b;
		return r;
	}
	public double multiply(double a, double b) 
	{
		double r= a*b;
		return r;
	}
	public double subtract(double a, double b) 
	{
		double r= a-b;
		return r;
	}
	public double division(double a, double b) 
	{
		double r = a/b;
		return r;
	}
}
