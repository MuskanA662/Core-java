package com.xworkz.encapsulation;

public class Hospital {
	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient) {
		boolean isAdmitted=false;
		if(isTreatmentRequired== true) {
		if(isEmergency ==true ) {
		 this.patient=patient;
		 this.patient.displayInfo();
		 System.out.print("patient can be allowed in icu");
		 
		}
		else {
			System.out.println("add the patient in general ward");
		}
	}
		else {
			System.out.println("treatment is required");
		}
		return isAdmitted;

}
}

