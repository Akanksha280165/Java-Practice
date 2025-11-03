package com.kodewala.akanksha.excutorservice2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Callable<String>
{
	@Override
	public String call() throws Exception 
	{
		System.out.println("my thread is "+Thread.currentThread().getName());
		String s=pay();
		return s;
	}
	public String pay()
	{
		System.out.println("inside pay()");
		return "success";
	}
}

public class CallableDemo1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		ExecutorService service=Executors.newCachedThreadPool();
		MyThread  t=new  MyThread();
		for(int i=0;i<=10;i++)
		{
			Future<String>  future=service.submit(t);
			System.out.println(future.get());
		}
		service.shutdown();
	}

}
