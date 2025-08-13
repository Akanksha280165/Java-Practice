package com.kodewala.akanksha;

public class Child extends Parent1 
{
	Double finalBalance;
	public Child() 
	{
		super();
		this.finalBalance=this.amount+count;
		System.out.println("the amount before transfer is :"+Parent1.count);
		System.out.println("the amount before transfer is :"+count);
		System.out.println("the amount after transfer is :"+this.finalBalance);
	}
	
	public static void main(String[] args) 
	{
		Child c1= new Child();
		
		
	}
}
