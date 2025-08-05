import java.util.Scanner;

public class String3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string : ");
		String s1=sc.nextLine();
		System.out.println();
		char[] arr=s1.toCharArray();
		int length=arr.length;
		char[] arr1= new  char[length];
		for(int i=0;i<length;i++)
		{
		   arr1[length-1-i]=arr[i];
		}
		
		String str= new String(arr1);
		System.out.println("the string after reversal is : "+str);
		String s2 =String.valueOf(arr1);
		System.out.println("the string after reversal is : "+s2);
		
	}
}