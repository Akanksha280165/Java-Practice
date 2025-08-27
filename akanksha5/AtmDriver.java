package com.kodewala.akanksha5;
import java.util.Scanner;

public class AtmDriver {

	public static void main(String[] args) {
		MoneyTransaction  mt=MoneyTransaction.getUserInfo();
		mt.setUserName(mt.getUserName());
		mt.setUserAccountNo(mt.getUserAccountNo());
		mt.setUserAmount(mt.getUserAmount());
		
		Scanner  sc=new  Scanner(System.in);
		System.out.println("enter the operation you want to perform");
		String s1=sc.nextLine();
		if(s1.equalsIgnoreCase("deposit")) {
			Double d1=mt.getCurrentBalance();
			double result=d1+mt.getUserAmount();
			System.out.println("the current balance after deposit is : "+result);
		}
		else if(s1.equalsIgnoreCase("withdrawal")) {
			Double d2=mt.getCurrentBalance();
			Double result1=d2-mt.getUserAmount();
			System.out.println("the current balance after withdrawal is : "+result1);
		}
		else if(s1.equalsIgnoreCase("checkBalance"))
		{
			System.out.println("the current balance is : "+mt.getCurrentBalance());
		}
		else
		{
			System.out.println("enter valid operation");
		}
		
		
	}

}
