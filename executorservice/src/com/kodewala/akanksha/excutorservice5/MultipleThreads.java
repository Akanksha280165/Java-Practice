package com.kodewala.akanksha.excutorservice5;

public class MultipleThreads extends Thread
{
	public void run()
	{
		System.out.println("thread executed is "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args)
	{
		MultipleThreads  mt=new MultipleThreads();
		Thread  t1=new  Thread(mt);
		Thread  t2=new  Thread(mt);
		Thread  t3=new  Thread(mt);
		t1.start();
		t2.start();
		t3.start();

	}

}
