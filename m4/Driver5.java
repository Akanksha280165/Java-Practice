package com.workspace.m4;
import java.util.Scanner;

public class Driver5 {
	int patientId;
	String patientName;
	String patientDoctor;
	String patientDiagnosis;
	public static void main(String[] args) 
	{
		Driver5 d1= new Driver5();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the patient Id :");
		d1.patientId=sc.nextInt();
		Driver5 d=setData(d1.patientId);
		System.out.println("the patient id  :"+d.patientId);
		System.out.println("the patient name :"+d.patientName);
		System.out.println("the patient doctor name  :"+d.patientDoctor);
		System.out.println("the patient diagnosis  :"+d.patientDiagnosis);
		
	}
	static Driver5 setData(int id) 
	{
		Driver5 d= new Driver5();
		d.patientId=id;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name :");
		d.patientName=sc.nextLine();
		System.out.println();
		System.out.println("enter the doctor name :");
		d.patientDoctor=sc.nextLine();
		System.out.println();
		System.out.println("enter the problem :");
		d.patientDiagnosis=sc.nextLine();
		return d;
		
	}
	

}
