package com.kodewala.akanksha;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1=sc.nextLine();
		int l1=s1.length();
		char arr[]=s1.toCharArray();
		int l2=arr.length;
		for(int i=0;i<l2;i++)
		{
			if(arr[i]!=' ')
			{
				count++;
			}
		}
		
		System.out.println("the length of string using loop is : "+count);
		System.out.println("the length of string using length() is : "+l1);
	}

}
