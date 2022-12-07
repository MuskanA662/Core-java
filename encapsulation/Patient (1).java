package com.xworkz.encapsulation;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Patient {

	private String patientName;
	private String address;
	private Gender gender;//gender is a enum it helps to write a constants
	private Integer age;
	
	public Patient() {
		
	}
	
//	public Patient(String patientName,String address,Gender gender,int age) {
//		this.patientName=patientName;
//		this.address=address;
//		this.gender=gender;	
//		this.age=age;
//	}
//	
	public void displayInfo() {
		System.out.println("patient name is: "+ patientName);
		System.out.println("patient address is: "+ address);
		System.out.println("patient gender is: "+ gender);
		System.out.println("patient age is: "+ age);
		
	}

	

}


