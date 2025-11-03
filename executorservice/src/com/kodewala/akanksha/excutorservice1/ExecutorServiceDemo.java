package com.kodewala.akanksha.excutorservice1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("my thread is "+Thread.currentThread().getName());
	}
}

public class ExecutorServiceDemo {

	public static void main(String[] args) 
	{
		//ExecutorService   service=Executors.newFixedThreadPool(5);
		//ExecutorService   service=Executors.newCachedThreadPool();
		//ExecutorService   service=Executors.newSingleThreadExecutor();
		//ExecutorService   service=Executors.newSingleThreadExecutor();
		ExecutorService    service=Executors.newSingleThreadScheduledExecutor();
		MyThread   t=new  MyThread();
		for(int i=0;i<=20;i++)
		{
			service.submit(t);
		}

	}

}
