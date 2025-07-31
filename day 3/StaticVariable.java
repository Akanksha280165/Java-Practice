import java.util.Scanner;

public class StaticVariable
{
	 static int amount;
	public static void main(String[] args)
	{
		System.out.println("the amount in the account before deposit is "+StaticVariable.amount);
		
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the amount to deposit :");
		amount=sc.nextInt();
		System.out.println("the amount in the account after deposit is "+StaticVariable.amount);
		
	}
}