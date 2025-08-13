package com.kodewala.akanksha;
import java.util.Scanner;

public class BankOperations {
	static double count=60000;
	String accountHolderName;
	String accountNumber;
	Double amount;
	public BankOperations() 
	{
		this("amtTransfer");
		
	}
	public BankOperations(String s1) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the account holder name : ");
		this.accountHolderName=sc.nextLine();
		System.out.println();
		System.out.print("enter the account number : ");
		this.accountNumber=sc.nextLine();
		
	}
	
	static double amountAdd(double amount)
	{
		double result=amount+count;
			return result;
	}
}
	


