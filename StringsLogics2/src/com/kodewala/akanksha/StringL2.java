package com.kodewala.akanksha;
import java.util.Scanner;
public class StringL2 {

	public static void main(String[] args)
	{
		Scanner scanner = new  Scanner(System.in);
		System.out.print("enter the Sentence: ");
		String s1= scanner.nextLine();
		System.out.println();
		
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			int count=0;
			for(int x=0;x<s2.length;x++)
			{
				if(s2[i]!="hello")
				{
					if(s2[i].equals(s2[x]))
					{
						count++;
						if(count>1)
						{
							s2[x]="hello";
						}	
					}
				}
			}
		}
		for(int x=0;x<s2.length;x++) {
		System.out.print(s2[x]+" ");
		}
	}
           
}
