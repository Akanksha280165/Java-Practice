package com.workspace.m4;


public class MethodC3 {
	int studentId;
	String studentName;
	String studentDepartment;
	public static void main(String[] args) 
	{
		MethodC3 m2= new MethodC3();
		MethodC3 m= m2.getData(101);
		System.out.println("name and department is :"+m.studentName+"   "+m.studentDepartment);
		MethodC3 m3= m2.getData(101);
		System.out.println("name and department is :"+m.studentName+"   "+m.studentDepartment);
		
	}
	MethodC3 getData(int id) 
	{
		MethodC3 m1= new MethodC3();
		
		if(id==101)
		{
			m1.studentName="Akanksha";
			m1.studentDepartment="cse";
		}
		else if(id==102) 
		{
			m1.studentName="Rahul";
			m1.studentDepartment="IT";
		}
		else {
			System.out.println("invalid ID");
		}
		return m1;
	}

}
