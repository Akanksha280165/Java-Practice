import java.util.Scanner;

public class StringReverse
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1= scanner.nextLine();
		System.out.println();
		int n=s1.length();
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
	}
}