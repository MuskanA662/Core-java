package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.AppoloHospital;
import com.xworkz.hospitalapp.hospital.Patient;

public class AppoloHospitalTester {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		AppoloHospital appoloHospitals = new AppoloHospital(size);
		
		for(int i = 0; i < size; i++) {
			Patient patient = new Patient();
			
			System.out.println("Enter the patient name");
			patient.setPatientName(sc.next());
			
			System.out.println("Enter the patients age");
			patient.setAge(sc.nextInt());
			
			System.out.println("Enetr patient's address");
			patient.setAddress(sc.next());
			
			System.out.println("Enter patient's gender");
	
			patient.setGender(Gender.valueOf(sc.next()));
			
			appoloHospitals.addPatient(patient);
			
		}
		
		
		//appoloHospitals.getAllPatients();
		
		System.out.println("Enter the patient name");
		String patientName = sc.next();
		appoloHospitals.getPatientByName(patientName);
		
		System.out.println("Enter patient age");
		int age = sc.nextInt();
		appoloHospitals.getPatientByAge(age);
		
		System.out.println("Enter patient address");
		String address = sc.next();
		appoloHospitals.getPatientByAddress(address);
		
		System.out.println("Enter patient gender");
		String gender = sc.next();
		appoloHospitals.getPatientByGender(Gender.valueOf(sc.next()));
		
		System.out.println("Enter the patient gender");
		String gender1 = sc.next();
		appoloHospitals.getPatientNameByGender(Gender.valueOf(sc.next()));
		
		System.out.println("Enter the patient name");
		String name = sc.next();
		appoloHospitals.getGenderByPatientName(name);
		
		System.out.println("Enter the patient name");
		String patientName1 = sc.next();
		System.out.println("Enter the patient new address");
		String address1 = sc.next();
		appoloHospitals.updatePatientAddressByName(patientName1,address1);
		
		System.out.println("Enter patient name");
		String name1 = sc.next();
		System.out.println("Enter new patient age");
		int age1 = sc.nextInt();
		appoloHospitals.updatePatientAgeByName(name1, age1);
		
		appoloHospitals.getAllPatients();
		
		System.out.println("Enter patient name we want to be delete");
		String name2 = sc.next();
		appoloHospitals.deletePatientByName(name2);
		
		System.out.println("Enter patient address we want to delete");
		String address2 = sc.next();
		appoloHospitals.deletePatientByAddress(address2);
		
		System.out.println("Enter patient age we want to delete");
		int age2 = sc.nextInt();
		appoloHospitals.deletePatientByAge(age2);
		
		appoloHospitals.getNewPatients();
		
	  
		sc.close();
		
	}


}
