package com.workspace.m2;
import java.util.Scanner;

  class Methodc3
{
	static double price=0.0;
	String foodItem;
	Double foodPrice;
}
  public class Excecute
 {
	 static double d1;
	 int c;
	 public static void main(String[] args)
	{
		 Excecute d= new Excecute();
		 Scanner sc= new Scanner(System.in);
		 System.out.print("enter the number of food items : ");
		 d.c=sc.nextInt();
		 sc.nextLine();
		 System.out.println("the food items ordered are : ");
		 for(int i=0;i<d.c;i++) 
		 {
			 Methodc3 m1=d.foodItems();
			 System.out.println(m1.foodItem+" price is "+m1.foodPrice);
			 d1=d.totalPrice(m1.foodPrice);
		 }
		 System.out.println("the total bill is : "+d1);
		 
	}
	public Methodc3 foodItems() 
	{
		Methodc3 m1= new Methodc3();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the food item : ");
		m1.foodItem=sc.nextLine();
		System.out.println();
		System.out.print("enter the price : ");
		m1.foodPrice=sc.nextDouble();
		System.out.println();
		return m1;
	}
	public Double totalPrice(double d) 
	{
		Methodc3.price=Methodc3.price+d;
		return Methodc3.price;
	}
 }

