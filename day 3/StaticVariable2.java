import java.util.Scanner;

public class StaticVariable2
{
	public static void  depositAmount()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the amount to deposit");
		double balance=sc.nextDouble();
		double result=StaticVariable1.balance + balance;
		System.out.print("the amount after depositing the money is : "+ result);
	}
}