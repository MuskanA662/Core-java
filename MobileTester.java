package com.xworkz.encapsulationnapp;

import com.xworkz.encapsulationnapp.encapsulationclassfiles.MobileDTO;

public class MobileTester {
public static void main(String arg[]) {
	MobileDTO mbl = new MobileDTO();
	mbl.setImeiNumber(47212);
	mbl.setBrand("Vivo");
	mbl.setShopName("vivoshop");
	
	System.out.println("Mobile IMEI NUmber is "+mbl.getImeiNumber());
	System.out.println("Mobile Brand Nmae is "+mbl.getBrand());
	System.out.println("Mobile Shop Name is "+mbl.getShopName());
}
}
