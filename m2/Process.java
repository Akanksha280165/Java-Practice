package com.workspace.m2;
import java.util.Scanner;

 class MethodC2 
{
	
	String productName;
	Double productPrice;
}
public class Process
{
	static Double d1;
	static int count;
	static Double total=0.0;
	public static void main(String[] args) 
	{
		Process d= new Process();
		Scanner sc = new Scanner(System.in);
		System.out.print("how many products you want to enter : ");
		count=sc.nextInt();
		sc.nextLine();
		System.out.println("the product inside cart is : ");
		for(int x= 0; x<count;x++) {
		MethodC2 m1= d.cartManager();
		System.out.println(m1.productName+" price is "+m1.productPrice);
		 d1=d.checkout(m1.productPrice);
		}
		System.out.println("total cart value is :"+d1);
	}
	public MethodC2 cartManager() 
	{
		Scanner sc = new Scanner(System.in);
		MethodC2 m1= new MethodC2();
		System.out.print("enter the product : ");
		m1.productName=sc.nextLine();
		System.out.println();
		System.out.print("enter the product price : ");
		m1.productPrice=sc.nextDouble();
		sc.nextLine();
		return m1;
	}
	public Double checkout(Double d) 
	{
		Process.total=Process.total+d;
		return Process.total;
	}
	
}


