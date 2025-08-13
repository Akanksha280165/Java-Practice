package com.kodewala.akanksha;

public class Manager extends Employee {
	
	public Manager() 
	{
		this("Rahul","1013231045");
		System.out.println("employee name is : "+this.empName);
		System.out.println("employee name is : "+this.empId);
		System.out.println("employee department is : "+this.empDep);
	}
	public Manager(String n1,String n2) 
	{
		super("IT");
		this.empName=n1;
		this.empId=n2;
		
	}
	public static void main(String[] args) 
	{
		Manager m = new Manager();
		
		

	}
	
}
