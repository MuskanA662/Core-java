package com.xworkz.encapsulationnapp;

import com.xworkz.encapsulationnapp.encapsulationclassfiles.FurnitureDTO;


public class FurnitureTester {
	public static void main(String args[]) {
		FurnitureDTO fur = new FurnitureDTO();
		fur.setNo(435);
		fur.setName("SOFA");
		fur.setType("Wooden");
		
		System.out.println("Song number is "+fur.getNo());
		System.out.println("Song name is "+fur.getName());
		System.out.println("Song singer is "+fur.getType());
	}

}
