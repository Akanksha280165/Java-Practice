package com.kodewala.akanksha;

public class User3 
{
	public User3() 
	{
		System.out.println("i am inside constructor without parameter");
	}
	public User3(String name) 
	{
		System.out.println("i am inside constructor with Stirng parameter");
	}
	public User3(double d) 
	{
		System.out.println("i am inside constructor with double parameter");
	}
    public static void main(String[] args) 
	{
		User3 user = new User3();
		System.out.println("i am outside constructor with no parameter");
		System.out.println();
		User3 user1 = new User3("mom");
		System.out.println("i am outside constructor with String parameter");
		System.out.println("*******");
		User3 user2 = new User3(34.6d);
		System.out.println("i am outside constructor with double parameter");
    }
}
