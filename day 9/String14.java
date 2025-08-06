import java.util.Scanner;

public class String14
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1=scanner.nextLine();
		System.out.println();
		char[] ch=s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int x=i+1;x<ch.length;x++)
			{
			   if(ch[i]==ch[x])
				{
					count++;
					break;
				}
				else
				{
					count=0;
					continue;
				}
				 if(count!=0)
				 {
				    System.out.print(" "+ch[i]);
					continue;
				 }
			}
		}
	}
}