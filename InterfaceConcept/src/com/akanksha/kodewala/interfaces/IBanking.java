package com.akanksha.kodewala.interfaces;

public interface IBanking {
	public static final int MAX_VALUE=100;
	int MIN_Value=10;
	public abstract void pay();
	public abstract void settle();
	public abstract void cancelPayment();
	void stopPayment();
	void doRTGSPayment();
	void interestRate();
	public String userAccountDetails();
	public int addAmount(int a, int b);
}
