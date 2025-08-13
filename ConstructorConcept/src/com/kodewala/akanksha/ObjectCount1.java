package com.kodewala.akanksha;

public class ObjectCount1 
{
	 static int count;
	{
		count++;
		
	}
	public ObjectCount1() 
	{
		System.out.println("inside constructor");
	}
	public static void main(String[] args) {
		ObjectCount1 obj1= new ObjectCount1();
		System.out.println();
		ObjectCount1 obj2= new ObjectCount1();
		System.out.println();
		ObjectCount1 obj3= new ObjectCount1();
		System.out.println();
		ObjectCount1 obj4= new ObjectCount1();
		System.out.println();
		ObjectCount1 obj5= new ObjectCount1();
		System.out.println(count);
	}

}
