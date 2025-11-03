package com.kodewala.akanksha.excutorservice4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo implements Callable<String>
{
	@Override
	public String call() throws Exception {
		String s= printEven();
		return s;
	}
	
	private String printEven() 
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(Thread.currentThread().getName()+"="+i);
			}
		}
		
		return null;
	}

	public static void main(String[] args) 
	{
		ExecutorService  service=Executors.newCachedThreadPool();
		Demo  d=new Demo();
		for(int i=1;i<=20;i++)
		{
			service.submit(d);
		}
		

	}

}
