package com.kodewala.akanksha;
import java.util.Scanner;
public class StringL7 
{
       public static void main(String[] args) 
	{
		int count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the sentence : ");
		String s1= scanner.nextLine();
		int n=s1.length();
		System.out.println();
		for(int i=0;i<n;i++)
		{
			if(s1.charAt(i)!=' '&&s1.charAt(i+1)==' ')
			{
				count++;
				continue;
			}
			else if(s1.charAt(i)!=' '&&s1.charAt(i+1)=='.'&&i<n-2)
			{
				count++;
				continue;
			}
			else if(s1.charAt(i)!=' '&&s1.charAt(i+1)=='.'&&i==n-2)
			{
				count++;
				break;
			}
			
			
		}
		  System.out.println("the number of words in the sentence is : "+count);
	}
}
