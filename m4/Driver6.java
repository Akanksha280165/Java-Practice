package com.workspace.m4;
import java.util.Scanner;

public class Driver6 {
	static int patientId;
	String patientName;
	String patientDoctor;
	String patientDiagnosis;

	public static void main(String[] args) 
	{
		Driver6 d=setData();
		System.out.println("the patient details are ");
		System.out.println(patientId);//classname is not used becoz entire code is in the same class  
		System.out.println(d.patientName);
		System.out.println(d.patientDoctor);
		System.out.println(d.patientDiagnosis);

	}
	static Driver6 setData() 
	{
		Driver6 d= new Driver6();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the id :");
		
		patientId=sc.nextInt();
		sc.nextLine();
		System.out.print("enter patient name :");
		d.patientName=sc.nextLine();
		System.out.println();
		System.out.print("enter patient doctor name :");
		d.patientDoctor=sc.nextLine();
		System.out.println();
		System.out.print("enter the problem :");
		d.patientDiagnosis=sc.nextLine();
		System.out.println();
		return d;
		
	}

}
