package com.workspace.m3;
import java.util.Scanner;

public class Transaction 
{
public static void main(String[] args)
	{
		Transaction ts= new Transaction();
		AccountDetails ad= ts.setUserData();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your email : ");
		String s1=sc.nextLine();
		if(s1.equals(AccountDetails.userAccountEmail)) 
		{
			System.out.print("enter the user password : ");
			String s2=sc.nextLine();
			if(s2.equals(AccountDetails.userAccountPwd)) 
			{
				System.out.println("the account details are :");
				System.out.println(ad.userAccountName);
				System.out.println(AccountDetails.userBalance);
				System.out.println(AccountDetails.userAccountEmail);
				System.out.print("enter the operation you want to perform : credit or debit or checkamount ");
				String s3=sc.nextLine();
				if(s3.equals("credit")) {
				System.out.print("enter the amount you want to add :");
				Double d1=sc.nextDouble();
				AccountDetails.userBalance=ts.addAmount(d1);
				System.out.print("the amount in the account after deposit is : "+AccountDetails.userBalance);
				}
				else if(s3.equals("debit")) 
				{
				System.out.print("enter the amount you want to deduct :");
				Double d2=sc.nextDouble();
				AccountDetails.userBalance=ts.deductAmount(d2);
				System.out.println("the amount in the account after withdrawing is "+AccountDetails.userBalance);
		        }
				else if(s3.equals("checkamount")) {
					System.out.println("the amount available in your account is : "+AccountDetails.userBalance);
				}
				else 
				{
					System.out.println("invalid operation request ");
				}
			}
			else
			{
				System.out.println("invalid password");
			}
		}
		else 
		{
		System.out.println("email does not exist ");
		System.out.println("create your login account ");
		}
	}
	public AccountDetails setUserData() 
	{
		AccountDetails ad= new AccountDetails();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the user email : ");
		AccountDetails.userAccountEmail=sc.nextLine();
		System.out.println();
		System.out.print("enter the user password : ");
		AccountDetails.userAccountPwd=sc.nextLine();
		System.out.println();
		System.out.print("enter the user account number : ");
		AccountDetails.userAccountNo=sc.nextLine();
		System.out.println();
		System.out.print("enter the user name : ");
		ad.userAccountName=sc.nextLine();
		System.out.println();
		System.out.print("the balance is : ");
		AccountDetails.userBalance=sc.nextDouble();
		return ad;
	}
	public Double addAmount(double d) 
	{
		AccountDetails.userBalance=AccountDetails.userBalance+d;
		return AccountDetails.userBalance;
	}
	public Double deductAmount(double d) 
	{
		AccountDetails.userBalance=AccountDetails.userBalance-d;
		return AccountDetails.userBalance;
	}
}
class AccountDetails
{
	 String userAccountName;
	static String userAccountNo;
	static String userAccountEmail;
	static String userAccountPwd;
	static Double userBalance;
}
