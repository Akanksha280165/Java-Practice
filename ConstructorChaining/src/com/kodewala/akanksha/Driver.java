package com.kodewala.akanksha;

  class Parent
{
	public Parent() 
	{
		System.out.println("pppp");
	}
	public Parent(String s1) 
	{
		System.out.println("ssss");
	}public Parent(int a) 
	{
		System.out.println("intintint");
	}
}

public class Driver extends Parent {
	public Driver() 
	{
		super(45);
		System.out.println("000000");
	}
	public Driver(double d) 
	{
		super("abc");
		System.out.println("double");
	}
	public Driver(boolean b) 
	{
		super();
		System.out.println("boolean");
	}

	public static void main(String[] args) 
	{
		Driver d1=new Driver();
		System.out.println("0000");
		System.out.println();
		Driver d2=new Driver(true);
		System.out.println("****");
		System.out.println();
		Driver d3=new Driver(56.89d);
		System.out.println("#####");
	}

}
