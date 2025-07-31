import java.util.Scanner;

public class InstanceVariable1
{
	double balance;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the amount in the account of customer : ");
		InstanceVariable1 iv= new InstanceVariable1();
		iv.balance=sc.nextDouble();
		
		InstanceVariable2.depositAmount(iv.balance);
		
	}
}