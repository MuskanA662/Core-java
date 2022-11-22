package com.xworkz.encapsulationnapp;

import com.xworkz.encapsulationnapp.encapsulationclassfiles.NailPolishDTO;

public class NailPolishTester {
public static void main(String args[]) {
	NailPolishDTO nail = new NailPolishDTO();
	nail.setId(347);
	nail.setColor("Maroon");
	nail.setShopName("XYZ");
	
	System.out.println("Nail polish id is "+nail.getId());
	System.out.println("Nail polish color is "+nail.getColor());
	System.out.println("Nail polish Shop Name is "+nail.getShopName());
}
}
