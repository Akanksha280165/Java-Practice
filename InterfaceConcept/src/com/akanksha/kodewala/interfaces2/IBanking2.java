package com.akanksha.kodewala.interfaces2;

public interface IBanking2 extends IRbi {
	public static final int MAX=100;
	int MIN=10;
	abstract void pay();
	public abstract void settle();
	void cancelCheque();//all methods are public abstract by default
	void stopPayment();
	void doRTGSPayment(boolean flag);
	public default void applyKcc()
	{
		
	}
	public static void printPassBook()// // 500 lines of code
	{
		//500 lines of code for printing passbook
		//this is common code which can be used
		//by any bank
	}
	
}
