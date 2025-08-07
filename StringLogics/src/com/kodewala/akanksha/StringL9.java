package com.kodewala.akanksha;
import java.util.Scanner;

public class StringL9 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1=scanner.next();// next() is used to take only single word as a string
		System.out.println();
		System.out.print("the string after reversing is:");
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
	}
}
