package com.kodewala.akanksha4;
import java.util.Scanner;

public class HospitalDataSystem {
	private String patientName;
	private String patientDoctor;
	private int patientAge;
	private String patientDisease;
	private double patientFees;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientDoctor() {
		return patientDoctor;
	}
	public void setPatientDoctor(String patientDoctor) {
		this.patientDoctor = patientDoctor;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientDisease() {
		return patientDisease;
	}
	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}
	public double getPatientFees() {
		return patientFees;
	}
	public void setPatientFees(double patientFees) {
		this.patientFees = patientFees;
	}
	public static HospitalDataSystem patientDetails(String s)
	{
		HospitalDataSystem  hds=new  HospitalDataSystem();
		Scanner  sc=new  Scanner(System.in);
		System.out.print("enter the patientName : ");
		hds.patientName=sc.nextLine();
		System.out.println();
		System.out.print("enter the patientAge : ");
		hds.patientAge=sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.print("enter the patientDisease : ");
		hds.patientDisease=sc.nextLine();
		System.out.println();
		System.out.print("enter the patientDoctor : ");
		hds.patientDoctor=sc.nextLine();
		System.out.println();
		System.out.print("enter the fees : ");
		hds.patientFees=sc.nextDouble();
		System.out.println();
		return hds;
	}

}
