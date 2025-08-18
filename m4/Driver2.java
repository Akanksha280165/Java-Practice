package com.workspace.m4;

public class Driver2 {
	int studentId;
	String studentName;
	String studentDepartment;

	public static void main(String[] args) 
	{
		Driver2 d1= new Driver2();
		d1.studentId=101;
		d1.studentName="Akanksha";
		d1.studentDepartment="CSE";
		Driver2 d2= new Driver2();
		d2.studentId=102;
		d2.studentName="Rahul";
		d2.studentDepartment="IT";
		Driver2 d3= new Driver2();
		d3.studentId=103;
		d3.studentName="Krishna";
		d3.studentDepartment="ECE";
		System.out.println("student details are");
		System.out.println("id is :"+d1.studentId+" "+d2.studentId+" "+d3.studentId);
		System.out.println("name is :"+d1.studentName+" "+d2.studentName+" "+d3.studentName);
		System.out.println("department is :"+d1.studentDepartment+" "+d2.studentDepartment+" "+d3.studentDepartment);
		

	}

}
