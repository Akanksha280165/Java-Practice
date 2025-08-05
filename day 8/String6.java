import java.util.Scanner;

public class String6
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new  Scanner(System.in);
		System.out.print("enter the string : ");
		String s1=sc.nextLine();
		System.out.println();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='$'||s1.charAt(i)=='_'||s1.charAt(i)=='@'||s1.charAt(i)=='#'||s1.charAt(i)=='&'||s1.charAt(i)=='*'||s1.charAt(i)=='!')
			{
				count++;
				continue;
			}
			
			else
			{
				
				continue;
				
			}
		}
		if(count!=0)
		{
			System.out.println("the number of special characters are : "+count);
		}
		else 
		{
			System.out.println("the string has no special characters ");
			
		}
	}
}