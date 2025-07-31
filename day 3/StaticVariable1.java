import java.util.Scanner;

public class StaticVariable1
{
	static double balance;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println(" the amount present in your account ");
		balance=sc.nextDouble();
		
		StaticVariable2.depositAmount();
		
		
		
		
		
		
	}
}