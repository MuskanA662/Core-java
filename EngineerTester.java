package com.xworkz.encapsulationnapp;

import com.xworkz.encapsulationnapp.encapsulationclassfiles.CsEngineer;
import com.xworkz.encapsulationnapp.encapsulationclassfiles.EcEngineer;

public class EngineerTester {
	public static void main(String[] args) {
		Engineer ecEngineer = new EcEngineer();
		Object message = ecEngineer.solveProblems();
		//String message = ecEngineer.solveProblems();
		System.out.println(message);
	
		Engineer CsEngineer = new CsEngineer();
		//String message1 = CsEngineer.solveProblems();
		Object message1 = CsEngineer.solveProblems();
		System.out.println(message1);

	}

}
