package com.kodewala.akanksha;
import java.util.Scanner;

public class Driver3 {
	String name;
	public Driver3() 
	{
		this("abc");
	}
	public Driver3(String s) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter the name : ");
		this.name=scanner.nextLine();
		System.out.println("the name is : "+name);
	}
		
	public static void main(String[] args) 
	{
		
		Driver3 d1= new Driver3();
	}

}
