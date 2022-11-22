package com.xworkz.encapsulationnapp;

import com.xworkz.encapsulationnapp.encapsulationclassfiles.BeachDTO;

public class BeachTester {
	public static void main(String args[]) {
		BeachDTO bch = new BeachDTO();
		bch.setId(11);
		bch.setName("malpe");
		bch.setAddress("Udapi");
		
		System.out.println("Beach id is " + bch.getId());
		System.out.println("Beach name is " + bch.getName());
		System.out.println("Beach address is " + bch.getAddress());
	}

}
