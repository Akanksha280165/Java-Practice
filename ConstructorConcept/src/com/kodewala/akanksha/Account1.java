package com.kodewala.akanksha;

import java.util.Scanner;

public class Account1 extends BankOperations {
	double finalBalance;

	public Account1(double amt1) {
		super();
		this.amount = amt1;
		this.finalBalance=BankOperations.amountAdd(this.amount);
		
		
		System.out.println("the final amount is "+this.finalBalance);
	}

	public Account1()
	{
		System.out.println("the total amount is : " + this.finalBalance);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount you want to transfer");
		Double amt = sc.nextDouble();
		
		Account1 acc = new Account1(amt);
		
		
	}
}
