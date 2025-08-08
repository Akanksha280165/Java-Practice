package com.kodewala.akanksha;
import java.util.Scanner;
public class StringL1 
{
	public static void main(String[] args)
	{
		Scanner scanner= new  Scanner(System.in);
		System.out.print("enter the string : ");
		String s1=scanner.next();
		System.out.println();
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int x=0;x<ch.length;x++)
			{
				if(ch[i]!='#')
				{
					if(ch[i]==ch[x])
					{
						count++;
						if(count>1&&i!=x)
						{
							ch[x]='#';
						}
					}
				}
			}
	}
		for(int j=0;j<ch.length;j++)
		{
			System.out.print(ch[j]);
		}
	}
}
