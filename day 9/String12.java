import java.util.Scanner;

public class String12
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter the sentence : ");
		String s1= scanner.nextLine();
		System.out.println();
		String[] s2=s1.split(" ");
		int n=s2.length;
		int[] arr= new  int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s2[i].length();
			System.out.print(arr[i]+" ");
			
		}
		    int temp=arr[0];
			for(int j=1;j<n;j++) 
			{
				if(arr[j]>temp)
				{
					temp=arr[j];
				}
			}
			System.out.println();
			System.out.println(temp);
	}}