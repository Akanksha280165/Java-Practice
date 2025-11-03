package com.kodewala.akanksha.excutorservice3;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Callable<String>, Runnable
{
	@Override
	public String call() throws Exception {
		String s=pay();
		return s;
	}
	public String pay()
	{
		System.out.println("thread is  "+Thread.currentThread().getName());
		return "success";
	}
	@Override
	public void run() {
		System.out.println("thread is "+Thread.currentThread().getName());
		
	}
}

public class ExecuteDemo1 {

	public static void main(String[] args) 
	{
		ExecutorService  service=Executors.newCachedThreadPool();
		MyThread  t=new  MyThread();
		for(int i=0;i<=10;i++)
		{
		service.execute(t);
		}
		

	}

}
