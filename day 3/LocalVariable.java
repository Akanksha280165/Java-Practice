import java.util.Scanner;

public class LocalVariable
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
	    int sum=n1+n2;
		int n3;
        System.out.println("the additon of numbers is :"+sum);
        System.out.println("the variable is local to main  ");
        		
		
	}
	
}