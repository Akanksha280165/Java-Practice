import java.util.Scanner;

public class String4
{
	public static void main(String[] args)
	{
		int count=0;;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string 1 : ");
		String s1=sc.nextLine();
		System.out.println();
		System.out.print("enter the string 2 : ");
		String s2=sc.nextLine();
		System.out.println();
		if(s1.length()==s2.length())
		{
		  System.out.println("both the strings are same in length hence comparison possible ");
		  System.out.println("the result is ");
		  
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
				    count=0;
				
				}
				else
				{
					count++;
					break;
				}
			}
			
			if(count!=0)
			{
				System.out.println("both the strings are not same ");
				
			}
			else
			{
				System.out.println("both the strings are  same ");
				
			}
			
		}
		else
		{
				System.out.println("both the strings are different in length hence comparison not possible ");
			
		}
		
		
	}
} 