package com.kodewala.akanksha;

public class User2 {
	public User2() 
	{
		this(20);
		System.out.println("inside constructor with no parameter");
	}
	public User2(int x) 
	{
		this("kodewala");
		System.out.println("inside constructor with int parameter");
	}
	public User2(String name) 
	{
		this(true);
		System.out.println("inside constructor with string parameter");
	}
	public User2(boolean b) 
    {
		
		System.out.println("inside constructor with boolean parameter");
    }
	public User2(double d) 
	{
		this(20);
		System.out.println("inside constructor with double parameter");
	}

	public static void main(String[] args) 
	{
		User2 user = new User2();
		System.out.println("******");
		System.out.println();
		User2 user1 = new User2(45);
		System.out.println("#######");
		System.out.println();
		User2 user2 = new User2("xyz");
		System.out.println("@@@@@@@");
		System.out.println();
		User2 user3 = new User2(false);
		System.out.println("!!!!!!!");
		System.out.println();
		User2 user4 = new User2(67.8d);
		System.out.println("+++++++");
		System.out.println();

	}

}
