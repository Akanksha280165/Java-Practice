package com.kodewala.akanksha;

import java.util.Scanner;

public class Parent1 
{
	static double count=90000;
	String name;
	String accountNo;
	Double amount;
	public Parent1() 
	{
		this(true);
	}
	public Parent1(boolean b) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name : ");
		this.name=sc.nextLine();
		System.out.println("enter account number : ");
		this.accountNo=sc.nextLine();
		System.out.println("enter the amount you want to add :");
		this.amount=sc.nextDouble();
	}
}
