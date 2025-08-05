import java.util.Scanner;

public class String5
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string 1 : ");
		String s1=sc.nextLine();
		System.out.println();
		System.out.print("Enter the string 2 : ");
		String s2=sc.nextLine();
		System.out.println();
		
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			System.out.println("both the strings are same in length hence comparison possible");
			System.out.println("the result after comparison is");
			for(int i=0;i<s1.length();i++)
			{
				if(s3.charAt(i)==s4.charAt(i))
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
				System.out.println("both strings are not same");
			}
			else
			{
				System.out.println("both strings are  same");
			}
		}
		
		else
		{
				System.out.println("both strings are not same in length hence comparison not possible");
		}	
	}
}