package com.kodewala.akanksha;

public class SchoolData extends StudentDetails{
	public SchoolData()
	{
		this(true);
		System.out.println("the student name is : "+this.stuName);
		System.out.println("the student  Id is : "+this.stuId);
		System.out.println("the student department is : "+this.stuDep);
	}
	public SchoolData(boolean b) 
	{
		super(34);
	}
}
