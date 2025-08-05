import java.util.Scanner;

public class String1
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1= sc.nextLine();
		System.out.println();
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
		  if(count!=0)
		  {
			  System.out.println("the no of consonants are : "+count);
		  }
		  else
		  {
			  System.out.println("there are no consonants in the string");
		  }
	}
}