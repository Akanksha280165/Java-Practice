package com.workspace.m4;

public class Driver3 {
	int studentId;
	String studentName;
	String studentDepartemnt;

	public static void main(String[] args)
	{
		Driver3 d=Driver3.getData(101);
		System.out.println("the details are :"+d.studentId+" "+d.studentName+" "+d.studentDepartemnt);
		Driver3 d1=Driver3.getData(102);
		System.out.println("the details are :"+d1.studentId+" "+d.studentName+" "+d.studentDepartemnt);

	}
  static Driver3 getData(int id) 
	{
		Driver3 d= new Driver3();
		d.studentId=id;
		d.studentName="Akanksha";
		d.studentDepartemnt="CSE";
		return d;
	}

}
