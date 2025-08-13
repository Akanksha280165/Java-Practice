package com.kodewala.akanksha;

public class User {
	static 
	{
		System.out.println("inside SIB");
	}
	{
		System.out.println("inside IIB/INIT");
	}
	public User() 
	{
		System.out.println("inside constructor");
	}

	public static void main(String[] args) 
	{
		User s1= new User();
		System.out.println("****");
		User s2= new User();
		System.out.println("3333");
		User s3= new User();
		System.out.println("4444");
		User s4= new User();
	}

}
