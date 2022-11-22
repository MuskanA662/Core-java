package com.xworkz.encapsulationnapp;

import com.xworkz.encapsulationnapp.encapsulationclassfiles.HotelDTO;

public class HotelTester {
	public static void main(String args[]) {
		HotelDTO htl = new HotelDTO();
			htl.setName("Vikrant");
			htl.setGstNo(8472);
			htl.setFoodType("Vegetarian");
			
			System.out.println("Hotel name is " +htl.getName());
			System.out.println("Hotel GstNo is " +htl.getGstNo());
			System.out.println("Hotel Food Type is " +htl.getFoodType());
		}
	
}
