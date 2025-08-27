package com.kodewala.akanksha5;
import java.util.Scanner;

public class MoneyTransaction {
	static double currentBalance=75009.0;
	private String userName;
	private String userAccountNo;
	private Double userAmount;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAccountNo() {
		return userAccountNo;
	}
	public void setUserAccountNo(String userAccountNo) {
		this.userAccountNo = userAccountNo;
	}
	public Double getUserAmount() {
		return userAmount;
	}
	public void setUserAmount(Double userAmount) {
		this.userAmount = userAmount;
	}
	public static MoneyTransaction getUserInfo() 
	{
		MoneyTransaction  mt=new  MoneyTransaction();
		Scanner  sc=new  Scanner(System.in);
		System.out.print("enter the userName : ");
		mt.userName=sc.nextLine();
		System.out.println();
		System.out.print("enter the userAccountNo : ");
		mt.userAccountNo=sc.nextLine();
		System.out.println();
		System.out.print("enter the amount : ");
		mt.userAmount=sc.nextDouble();
		return mt;
	}
	public static double getCurrentBalance() {
		return currentBalance;
	}
	public static void setCurrentBalance(double currentBalance) {
		MoneyTransaction.currentBalance = currentBalance;
	}

}
