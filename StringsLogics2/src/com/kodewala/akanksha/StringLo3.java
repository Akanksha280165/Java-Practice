package com.kodewala.akanksha;
import java.util.Scanner;

public class StringLo3 
{
    public static void main(String[] args)
    {
    	Scanner scanner = new  Scanner(System.in);
    	System.out.print("enter the string : ");
    	String s1=scanner.next();
    	System.out.println();
    	char[] s2=s1.toCharArray();
    	int sum=0;
    	for(int i=0;i<s2.length;i++)
    	{
    		for(int x=1;x<=s2.length;x++)
    		{
    			if(s2[i]==x)
    			{
    				sum=sum+s2[i];
    			}
    		}
    	}
    	System.out.print(sum);
    }
}
