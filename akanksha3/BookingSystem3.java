package com.kodewala.akanksha3;

public class BookingSystem3 {

	public static void main(String[] args) {
		FlightTicketSystem  fts=FlightTicketSystem.userInfo();
		fts.setUserName(fts.getUserName());
		fts.setUserSeat(fts.getUserSeat());
		fts.setPrice(fts.getPrice());
		System.out.println("userName is : "+fts.getUserName());
		System.out.println("userSeat is : "+fts.getUserSeat());
		System.out.println("total airfare is : "+fts.getPrice());
	}

}
