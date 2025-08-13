package com.kodewala.akanksha;

public class ObjectCount 
{
	static int count;
	public ObjectCount() 
	{
		count++;
	}

	public static void main(String[] args) 
	{
		ObjectCount obj=new ObjectCount();
		ObjectCount obj1=new ObjectCount();
		ObjectCount obj2=new ObjectCount();
		ObjectCount obj3=new ObjectCount();
		System.out.print(count);

	}

}
