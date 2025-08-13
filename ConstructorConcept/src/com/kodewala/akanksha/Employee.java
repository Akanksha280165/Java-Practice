package com.kodewala.akanksha;


public class Employee 
{
	String empName;
	String empId;
	String empDep;
	public Employee() 
	{
		this("Akanksha","1013231015","computer science");
		System.out.println("employee name is : "+this.empName);
		System.out.println("employee Id is : "+this.empId);
		System.out.println("employee department is : "+this.empDep);
	}
	public Employee(String s1,String s2,String s3) 
	{
		this.empName=s1;
		this.empId=s2;
		this.empDep=s3;
	}
	public Employee(String _department) 
	{
		this();
		this.empDep=_department;
	}
	

}
