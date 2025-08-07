package com.kodewala.akanksha;

import java.util.Scanner;

public class StringL4 {

	public static void main(String[] args)
	{
		int count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the String :");
		String s1=scanner.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a')
			{
				
				continue;
			}
			
			else if(s1.charAt(i)=='e')
			{
				
				continue;
			}
			
			else if(s1.charAt(i)=='i')
			{
				
				continue;
			}
			
			else if(s1.charAt(i)=='o')
			{
				
				continue;
			}
			
			else if(s1.charAt(i)=='u')
			{
				
				continue;
			}
			
			else
			{
				count++;
			}
		
		}
		System.out.println("the number of consonants are : "+count);
		

	}

}
