package com.kodewala.akanksha;

public class Driver2 {
	public Driver2() 
	{
		System.out.println("inside constructor without arguments");
	}
	public Driver2(double d) 
	{
		System.out.println("inside constructor with double ");
	}
	public Driver2(int x) 
	{
		this(67.89d);
		System.out.println("inside constructor with integer ");
	}
	public Driver2(String s) 
	{
		this();
		System.out.println("inside constructor with String");
	}

	public static void main(String[] args) 
	{
		Driver2 d2= new Driver2("kodewala");
		System.out.println("**********");
		Driver2 d3= new Driver2(45);
		System.out.println("##########");
	}

}
