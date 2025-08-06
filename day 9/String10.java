import java.util.Scanner;

public class String10
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter the sentence : ");
		String s1=scanner.nextLine();
		System.out.println();
		String[] s2=s1.split(" ");
		//System.out.println(s2);
		System.out.println(s2.length);
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i]+" ");
		}
		System.out.println("the number of words in a entered sentence is : "+s2.length);
	}
}