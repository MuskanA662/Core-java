package com.xworkz.encapsulationnapp;

import com.xworkz.encapsulationnapp.encapsulationclassfiles.SongDTO;

public class SongTester {
	public static void main(String args[]) {
		SongDTO sng = new SongDTO();
		sng.setNo(435);
		sng.setName("sab tere");
		sng.setSinger("Arman malik");
		
		System.out.println("Song number is "+sng.getNo());
		System.out.println("Song name is "+sng.getName());
		System.out.println("Song singer is "+sng.getSinger());
	}

}
