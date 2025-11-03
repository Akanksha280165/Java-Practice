package com.kodewala.akanksha.excutorservice6;

public class WaitConcept extends Thread
{
	private void waitMethod()
	{
		System.out.println("inside wait ()");
		System.out.println(Thread.currentThread().getName());
		try 
		{
		wait();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		waitMethod();
	}
	public static void main(String[] args)
	{
		WaitConcept  wc=new  WaitConcept();
		Thread  t=new  Thread();
		t.start();
		
	}
}
