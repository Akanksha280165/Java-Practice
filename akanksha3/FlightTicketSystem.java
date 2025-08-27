package com.kodewala.akanksha3;
import java.util.Scanner;

public class FlightTicketSystem {
	private String userName;
	private String userSeat;
	private Double price;
	private int s;
	public static FlightTicketSystem userInfo() 
	{
		FlightTicketSystem   fts=new  FlightTicketSystem();
		Scanner  sc=new  Scanner(System.in);
		System.out.print("enter the userName : ");
		fts.userName=sc.nextLine();
		System.out.println();
		System.out.print("enter the userSeat : ");
		fts.userSeat=sc.nextLine();
		System.out.println();
		System.out.print("enter the number of users : ");
		fts.s=sc.nextInt();
		fts.price=(double) (fts.s*2300);
		System.out.println();
		return fts;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSeat() {
		return userSeat;
	}
	public void setUserSeat(String userSeat) {
		this.userSeat = userSeat;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
