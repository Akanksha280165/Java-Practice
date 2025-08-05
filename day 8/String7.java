import java.util.Scanner;

public class String7
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the String : ");
		String s1=sc.nextLine();
		System.out.println();
		System.out.print("enter the character at you want to search : ");
		char ch=sc.next().charAt(0);
		System.out.println();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
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
			System.out.println("the number of times the given character is present is : "+count);
		}
		else
		{
			System.out.println("the given string does not contain the character ");
		}
		
		
	}
}