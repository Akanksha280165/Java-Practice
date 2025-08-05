import java.util.Scanner;

public class String2
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1=sc.nextLine();
		String s2=s1.toLowerCase();
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='a' ||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o' ||s2.charAt(i)=='u')
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
		 System.out.println("the number of consonants are : "+count);
		}
	}
}