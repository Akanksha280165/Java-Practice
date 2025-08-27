package com.kodewala.akanksha4;
import java.util.Scanner;

public class HospitalDriver {

	public static void main(String[] args) {
		Scanner  sc=new  Scanner(System.in);
		System.out.println("enter the day ");
		String s1=sc.nextLine();
		if(s1.equals("sunday"))
		{
			System.out.println("no patients accepted today");
		}
		else
		{
			System.out.println("!!!welcome!!!!");
			System.out.println(" enter your details please");
			HospitalDataSystem  hds= HospitalDataSystem.patientDetails(s1);
			hds.setPatientName(hds.getPatientName());
			hds.setPatientAge(hds.getPatientAge());
			hds.setPatientDisease(hds.getPatientDisease());
			hds.setPatientDoctor(hds.getPatientDoctor());
			hds.setPatientFees(hds.getPatientFees());
			System.out.println("user name is : "+hds.getPatientName());
			System.out.println("user doctor is : "+hds.getPatientDoctor());
			System.out.println("user disease is : "+hds.getPatientDisease());
			System.out.println("user age is : "+hds.getPatientAge());
			System.out.println("user fees is : "+hds.getPatientFees());
		}
	        
	}

}
