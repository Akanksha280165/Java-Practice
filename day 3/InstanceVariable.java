import java.util.Scanner;

public class InstanceVariable
{
	int balance;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 
		InstanceVariable iV= new InstanceVariable();
		
		
		System.out.println("the account has amount = "+iV.balance);
		System.out.println("enter the money to deposit");
		iV.balance = sc.nextInt();
		
		
		System.out.println("the account has amount = "+iV.balance);
		
		
	}
}