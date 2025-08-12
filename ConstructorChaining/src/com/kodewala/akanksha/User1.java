package com.kodewala.akanksha;

public class User1 
{
	public User1()
	{
		this("abc");
		//super();
		System.out.println("i am inside contructor");
	}
	
	public User1(String name)
	{
	    
		System.out.println("i am inside constructor with String argument");
	}

	public static void main(String[] args) 
	{
		User1 user= new User1();
		System.out.println("i am inside main");
		User1 user1= new User1("concept");
	}
}
