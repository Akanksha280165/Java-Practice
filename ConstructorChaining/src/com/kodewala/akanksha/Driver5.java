package com.kodewala.akanksha;
import java.util.Scanner;

public class Driver5 {
	int x, y;
	public Driver5() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  both the  numbers you want to add: ");
		this.x=sc.nextInt();
		this.y=sc.nextInt();
	}
	public Driver5(String s)
	{
		this();
		int s1=x+y;
		System.out.println("the result after "+s+" is "+s1);
	}

	public static void main(String[] args) 
	{
		Driver5 d1= new Driver5("Addition");
	}

}
