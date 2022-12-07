package com.xworkz.encapsulation;

import java.util.Scanner;


public class ApolloHospitalTester {
public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		
		ApolloHospital apolloHospital=new ApolloHospital(size);
		
		for(int i=0;i<size;i++) {
		 Patient patient=new Patient();
		 System.out.println("enter the patientName ");
		 patient.setPatientName(scanner.next());//getter ,setter
		 //patient.patientName="bagyamma";
		 //patient.patientName=scanner.next();
		 
		 
		 System.out.println("enter the age ");
		 patient.setAge(scanner.nextInt());
		 //patient.age=23;
		 //patient.age=scanner.nextInt();
		 
		System.out.println("enter the gender");
		patient.setGender(Gender.valueOf(scanner.next()));
		
		 //patient.gender=Gender.female;
		//String gender=scanner.next();
		//patient.gender = Gender.valueOf(gender);

		 System.out.println("enter the address ");
		 patient.setAddress(scanner.next());
		// patient.address="nelamangal";
		// patient.address=scanner.next();
		 
		 
		 
		 apolloHospital.addPatient(patient);

		 
		
		}
		 apolloHospital.getAllPatients();
		 
		 //System.out.println("Enter the Patient name : ");
		 //apolloHospital.getPatientByName(scanner.next());
		 
		 
		 //System.out.println("Enter the Patient age : ");
		 //apolloHospital.getPatientByAge(scanner.nextInt());
		 
		 //System.out.println("Enter the Patient address : ");
		 //apolloHospital.getPatientByAddress(scanner.next());
		 
		/* System.out.println("Enter the Patient gender : ");
		 apolloHospital.getPatientByGender(Gender.valueOf(scanner.next()));*/
		 
		/* System.out.println("Enter the Patient gender : ");
		 apolloHospital.getPatientNameByGender(Gender.valueOf(scanner.next()));*/
		 
		/* System.out.println("Enter the Patient name : ");
		 apolloHospital.getGenderByPatientName(scanner.next()); */
		 
		 
		 scanner.close();

}
}
