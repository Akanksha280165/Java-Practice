package com.kodewala.akanksha;

import java.util.Scanner;

public class Manager1 extends Employee1 {
	public Manager1() 
	{
		this("Kodewala");
		System.out.println("the department of employee is : "+this.empDep);
	}
	public Manager1(String _department) 
	{
		super(true);
	}

}
