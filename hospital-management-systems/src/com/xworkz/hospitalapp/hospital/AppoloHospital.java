package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constant.Gender;

public class AppoloHospital extends Hospital {
		
		//One to many
		public Patient[] patients;
		Patient[] newPatient;
		int index;
		
		public AppoloHospital() {
			
		}
		 
		//to add the size in tester we add variable in constructor
		public AppoloHospital(int size) {
			patients = new Patient[size];	
		}
		
		public boolean addPatient(Patient patient) {
			System.out.println("Inside addPatient method");
			boolean isPatientAdded = false;
			if(patient != null) {
				System.out.println("Patient's details are right go ahead");	
				patients[index++] = patient;
				isPatientAdded = true;
				//index++;
			}
			return isPatientAdded;
		}
		
		public void getAllPatients() {
			System.out.println("List of all the patinet names");
			for(int i  = 0; i < patients.length; i++) {
				System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
			                       patients[i].getGender());		
			}
		}
		
		public void getPatientByName(String patientName) {
			System.out.println("inside getPatientByName");
			System.out.println("No of parameters : 1 : patientName(String)");
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].getPatientName().equals(patientName)) {
					System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
		                       patients[i].getGender());		
				}
				else {
					System.out.println("No patient information found");
				}
			}
			
		}
		
		public void getPatientByAge(int age) {
			System.out.println("inside getPatientByAge");
			System.out.println("NO of parameters : 1 : pateintAge(int)");
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].getAge() == age) {
					System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
		                       patients[i].getGender());		
				}
				else {
					System.out.println("No patient information found");
				}
			}
			
		}
		
		public void getPatientByAddress(String address) {
			System.out.println("inside getPatientByAddress ");
			System.out.println("NO of parameters : 1 : pateintAddress(String)");
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].getAddress().equals(address)) {
					System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
		                       patients[i].getGender());
				}
				else {
					System.out.println("No patient information found");
				}
			}
		}
		
		public void getPatientByGender(Gender gender) {
			System.out.println("inside getPatientByGender ");
			System.out.println("NO of parameters : 1 : pateintGender(Gender)");
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].getGender().equals(gender)) {
					System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
		                       patients[i].getGender());
				}
				else {
					System.out.println("No patient information found");
				}
			}
		}
		
		public void getPatientNameByGender(Gender gender) {
			System.out.println("inside getPatientNameByGender ");
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].getGender().equals(gender)) {
					System.out.println(patients[i].getPatientName());
				}
			}
		}
		
		public void getGenderByPatientName(String name) {
			System.out.println("inside getGenderByPatientName");
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].getPatientName().equals(name)) {
					System.out.println(patients[i].getGender());
				}
			}
		}
		
		public boolean updatePatientAddressByName(String name, String newPatientAddress) {
			boolean isUpdated = false;
			System.out.println("inside updatePatientAddressByName");
			System.out.println("NO of parameters : 2 : 1) param pateintname(String) 2) param patientAdrres(String)");
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].getPatientName().equals(name)) {
					System.out.println("Patients name is matched.. proceed with updating the address");
					patients[i].setAddress(newPatientAddress);
					isUpdated = true;
				}
			}
			
			
			return isUpdated;
		}
		
		public boolean updatePatientAgeByName(String patientName, int newPatientAge) {
			boolean isUpdated = false;
			System.out.println("inside updatePatientNameByGender");
			System.out.println("No of parameters : 2 : 1) param pateintname(String) 2) param gender(String)");
			for(int i = 0; i < patients.length; i++) {
				if(patients[i].getPatientName().equals(patientName)) {
					patients[i].setAge(newPatientAge);
					isUpdated = true;
				}
			}
			return isUpdated;
		}
		
		public boolean deletePatientByName(String name) {
			boolean isDeleted = false;
			newPatient = new Patient[patients.length-1];
			for(int i = 0, k = 0; i < patients.length; i++) {
				if(!patients[i].getPatientName().equals(name)) {
					newPatient[k++] = patients[i];
					isDeleted = true;
				}
			}
			return isDeleted;
		}
		
		public boolean deletePatientByAddress(String address) {
			boolean isDeleted = false;
			newPatient = new Patient[patients.length-1];
			for(int i = 0, k = 0; i < patients.length; i++) {
				if(!patients[i].getAddress().equals(address)) {
					newPatient[k++] = patients[i];
					isDeleted = true;
				}
			}
			return isDeleted;
		}
		
		public boolean deletePatientByAge(int age) {
			boolean isDeleted = false;
			newPatient = new Patient[patients.length-1];
			for(int i = 0, k = 0; i < patients.length; i++) {
				if(!patients[i].getAge().equals(age)) {
					newPatient[k++] = patients[i];
					isDeleted = true;
				}
			}
			return isDeleted;
		}
		
		public void getNewPatients() {
			System.out.println("List of patients are");
			for(int i = 0; i < newPatient.length; i++) {
				System.out.println(newPatient[i].getPatientName() +" "+ newPatient[i].getAddress() + " "+ newPatient[i].getAge() + " "+ 
						newPatient[i].getGender());
			}
		}
		

	}

	//getPatiemtByAge(int age)
	//getPatientByAddress(String address)
	//getPatientByGender(Gender gender)
	//getGenderByPatientName(String patientName)
	//deletePatientByAge
	//deletePatientByAddress
	//getPatientNameByGender(Gender gender)
