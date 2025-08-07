package com.kodewala.akanksha;
import java.util.Scanner;

public class StringL8 {

	public static void main(String[] args)
	{
		int n=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the sentence :");
		String s1=scanner.nextLine();//nextLine() is used to take entire line as a string input
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String s3=s2[i];
			 n=s3.length();
			for(int x=n-1;x>=0;x--)
			{
				System.out.print(s3.charAt(x));
			}
				
				System.out.print(" ");
		}

	}

}
