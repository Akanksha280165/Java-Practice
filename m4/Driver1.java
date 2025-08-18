package com.workspace.m4;

public class Driver1 {
	int studentId;
	String studentName;
	String studentDepartment;

	public static void main(String[] args) 
	{
		Driver1 d1= new Driver1();
		Driver1 d= d1.getData(101);
		System.out.println("student details are :"+d.studentId+" "+d.studentName+" "+d.studentDepartment);
		Driver1 d3= new Driver1();
		d3.studentId=102;
		d3.studentName="Rahul";
		d3.studentDepartment="IT";
		System.out.println("student details are :"+d3.studentId+" "+d3.studentName+" "+d3.studentDepartment);
	}
	  Driver1 getData(int id)
	{
		Driver1 d2= new Driver1();
		d2.studentId=101;
		d2.studentName="akanksha";
		d2.studentDepartment="CSE";
		return d2;
	}

}
