package com.workspace.m3;

import java.util.Scanner;

public class CartCalculator {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		CartCalculator c1= new CartCalculator();
		System.out.println("do you want to enter product : ");
		String s3=sc.nextLine();
		if(s3.equalsIgnoreCase("yes"))
		{
		 ProductData pd =c1.cartItems();
		 System.out.print("enter the product category : ");
		 String s1=sc.nextLine();
		 if(s1.equals(pd.productCategory))
		 {
		 System.out.println("enter the product name");
		 String s2=sc.nextLine();
		 if(s2.equals(pd.productName)) 
		 {
			 System.out.println("the product details are : "+pd.productName+" "+pd.productPrice);
		 }
		 else
		 {
			 System.out.println("wrong input");
		 }
		 }
		 else
		 {
			 System.out.println("wrong category");
		 }
		}
		else if(s3.equalsIgnoreCase("no")) 
		{
			System.out.println("thanks for shopping ");
		}
    }
	public ProductData cartItems() 
	{
		ProductData pd= new ProductData();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the product category,name ,price :");
		pd.productCategory=sc.nextLine();
		pd.productName=sc.nextLine();
		pd.productPrice=sc.nextDouble();
		//sc.nextLine();
		return pd;
	}
}
class ProductData
{
	static int count;
	String productCategory;
	String productName;
	Double productPrice;
}
