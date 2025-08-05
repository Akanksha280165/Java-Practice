import java.util.Scanner;

public class String8
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
			if(s1.charAt(i)=='0'||s1.charAt(i)=='1'||s1.charAt(i)=='2'||s1.charAt(i)=='3'||s1.charAt(i)=='4'||s1.charAt(i)=='5'||s1.charAt(i)=='6'||s1.charAt(i)=='7'||s1.charAt(i)=='8'||s1.charAt(i)=='9')
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
			 System.out.println("the string has digits also nd the number of digits are : "+count);
		 }
		 else
		 {
			 System.out.println("the strings is only alphabets");
		 }
		
	}
}