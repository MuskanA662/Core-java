package com.xworkz.encapsulation;

public class ApolloHospital extends Hospital{
	
		
		//one to many
		public Patient[] patients;
		int index;
		
		public ApolloHospital(int size) {
			patients=new Patient[size];
		}
		
		
		public boolean addPatient(Patient patient) {
			System.out.println("inside addpatient method");
			boolean isPatientAdded = false;
			if(patient !=null) {
			
			System.out.println("Patients details are ");
			patients[index++]=patient;//write here ++
			isPatientAdded=true;
			//index++;
		}
			return isPatientAdded;
			
	}
		
		public void getAllPatients() {
			System.out.println("list of pateints are");
			for (int i=0;i<patients.length;i++) {
				System.out.println(patients[i].getPatientName()+" "+patients[i].getAge()+" "+patients[i].getGender()+" "+patients[i].getAddress());
				//System.out.println(patients[i].patientName);
			}
		}
		
//		public void getPatientByName(String patientName) {
//			System.out.println("inside getPatientByName");
//			System.out.println("No of parameters:1 : patientName(String)");
//			for(int i=0;i<patients.length;i++) {
//				if(patients[i].getPatientName().equals(patientName)) {
//					System.out.println(	patients[i].getPatientName()+" "+patients[i].getAge()+" "+patients[i].getGender()+" "+patients[i].getAddress());
//				
//					
//				}
//				else {
//					System.out.println("no patient found");
//				}
//				
//			}
//		}
		
		/*public void getPatientByAge(int age) {
			System.out.println("inside getPatientByAge");
			System.out.println("No of parameters:1:patientAge(int)");
			for(int i=0;i<patients.length;i++) {
				if(patients[i].getAge().equals(age)) {
					System.out.println(	patients[i].getPatientName()+" "+patients[i].getAge()+" "+patients[i].getGender()+" "+patients[i].getAddress());

					
				}else {
					System.out.println("not fount ");
				}
				
			}
			
			
		}*/
		
//	public void getPatientByAddress(String address) {
//		System.out.println("inside getPatientByAddress");
//			System.out.println("no of parameters:1:patientAddress(String)");
//			for(int i=0;i<patients.length;i++) {
//				if(patients[i].getAddress().equals(address)) {
//				System.out.println(	patients[i].getPatientName()+" "+patients[i].getAge()+" "+patients[i].getGender()+" "+patients[i].getAddress());
//			
//				
//			}
//			else {
//				System.out.println("no patient found");
//			}
//			
//		}
//	}
//		

		
		/*public void getPatientByGender(Gender gender) {
			System.out.println("inside getPatientByGender");
				System.out.println("no of parameters:1:patientGender(Gender)");
				for(int i=0;i<patients.length;i++) {
					if(patients[i].getGender().equals(gender)) {
					System.out.println(	patients[i].getPatientName()+" "+patients[i].getAge()+" "+patients[i].getGender()+" "+patients[i].getAddress());
				
					
				}
				else {
					System.out.println("no patient found");
				}
				
			}
		}*/
		
		
		/*public void getPatientNameByGender(Gender gender) {
			System.out.println("inside getPatientByGender");
				System.out.println("no of parameters:1:patientGender(Gender)");
				for(int i=0;i<patients.length;i++) {
					if(patients[i].getGender().equals(gender)) {
					System.out.println(	patients[i].getPatientName()+" "+patients[i].getAge()+" "+patients[i].getGender()+" "+patients[i].getAddress());
				
					
				}
				else {
					System.out.println("no patient found");
				}
				
			}
		
		
}*/
	
		
		public void getGenderByPatientName(String patientName) {
			System.out.println("inside getGenderByPatientName");
				System.out.println("no of parameters:1:patientName(String)");
				for(int i=0;i<patients.length;i++) {
					if(patients[i].getPatientName().equals(patientName)) {
					System.out.println(	patients[i].getPatientName()+" "+patients[i].getAge()+" "+patients[i].getGender()+" "+patients[i].getAddress());
				
					
				}
				else {
					System.out.println("no patient found");
				}
				
			}
		
		
}
		
}
//getPatientByAge(int age)
//getPatientByAddress(String address)
//getPatientByGender(Gender gender)
//getPatientNameByGender(Gender)
//getGenderByPatientName(String)

	
	
	




