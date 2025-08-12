package com.kodewala.akanksha;

class Student {
	Student(String instName) {
         System.out.println(instName);
	}

}

public class Driver1 extends Student {
	Driver1(String name, String id) {
		super("kodewala");
		System.out.println(name +" "+id);
	}

	public static void main(String[] args) {
		Driver1 d1 = new Driver1("Akanksha", "10132345");
		

	}

}
