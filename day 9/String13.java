import java.util.Scanner;

public class String13
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter the sentence : ");
		String s1=scanner.nextLine();
		System.out.println();
		String[] s2=s1.split(" ");
	    int[] arr= new  int[s2.length];
		for(int i=0;i<s2.length;i++)
		{
			arr[i]=s2[i].length();
		    System.out.print(arr[i]+" ");
		}
			int temp=arr[0];
			for(int x=1;x<s2.length;x++)
			{
				if(arr[x]<temp)
				{
					temp=arr[x];
				}
			}
			System.out.println();
			System.out.println(temp);
		}
}