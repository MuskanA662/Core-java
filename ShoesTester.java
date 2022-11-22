package com.xworkz.encapsulationnapp;

import com.xworkz.encapsulationnapp.encapsulationclassfiles.ShoesDTO;

public class ShoesTester {
	public static void main(String args[]) {
		ShoesDTO sh = new ShoesDTO();
		sh.setSize(8);
		sh.setName("heels");
		sh.setBrand("Bata");
		
		System.out.println("Song size is "+sh.getSize());
		System.out.println("Song name is "+sh.getName());
		System.out.println("Song brand is "+sh.getBrand());
	}

}
