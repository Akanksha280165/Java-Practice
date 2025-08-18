package com.workspace.m4;
import java.util.Scanner;

public class Driver4 {
	int patientId;
	String patientName;
	String patientDiagnosis;
	String patientDoctor;

	public static void main(String[] args) 
	{
		Driver4  d3= new  Driver4();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the patient Id :");
		d3.patientId=sc.nextInt();
		sc.nextLine();
		Driver4 d1=d3.setDetails(d3.patientId);
		System.out.println("the patient info is :");
		System.out.println(d1.patientId);
		System.out.println(d1.patientName);
		System.out.println(d1.patientDoctor);
		System.out.println(d1.patientDiagnosis);
		

	}
	Driver4 setDetails(int id) 
	{
		Driver4 d= new Driver4();
		d.patientId=id;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the patient  Name,Doctor,Diagnosis :");
		System.out.println();
		d.patientName=sc.nextLine();
		d.patientDoctor=sc.nextLine();
		d.patientDiagnosis=sc.nextLine();
		return d;
		
	}

}
