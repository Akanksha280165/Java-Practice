package com.kodewala.akanksha;

class Bank extends Object
{
    public Bank(int amount)
    {
	super();
	System.out.println(" inside bank constructor");
    }
    
    public Bank()
    {
    	//this(56);
    	super();
	System.out.println(" BANK()");
    }
}

public class Account extends Bank
{

    int accountBalance;

    public Account()
    {
	super();
	
	
    }
    public static void main(String[] args)
    {
	Account acc = new Account();
	System.out.println("#####");
	Bank bank = new Bank();
    }
}