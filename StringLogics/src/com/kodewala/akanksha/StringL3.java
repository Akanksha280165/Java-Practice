package com.kodewala.akanksha;

import java.util.Scanner;

public class StringL3 {

	public static void main(String[] args) 
	{
		int count=0;
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1=scanner.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a')
			{
				count++;
			}
			
			else if(s1.charAt(i)=='e')
			{
				count++;
			}
			
			else if(s1.charAt(i)=='i')
			{
				count++;
			}
			
			else if(s1.charAt(i)=='o')
			{
				count++;
			}
			
			else if(s1.charAt(i)=='u')
			{
				count++;
			}
			
		}
		       if(count!=0)
		       {
		    	   System.out.println("the number of vowels are : "+count);
		       } 
		       
		       else
		       {
		    	   System.out.println("the string has no vowels");
		       }
		

	}

}
