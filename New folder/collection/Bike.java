package com.xworkz.collectionapp;

import java.util.TreeSet;

public class Bike {

		public static void main(String args[]) {
			String bikes1="KTM";
			String bikes2="Suzuki";
			String bikes3="Royal enefield";
			String bikes4="Tvs jupitor";
			String bikes5="bajaj pulsur";
			String bikes6="honda shine";
			String bikes7="yamaha";
			String bikes8="BMW";
			String bikes9="Avenger";
			String bikes10="scooty";
			String bikes11="Bajaj platina";
			String bikes12="Bajaj chetak";
			String bikes13="TVS apache";
			
			TreeSet<String> collections=new TreeSet<String>();
			
			collections.add(bikes1);
			collections.add(bikes2);
			collections.add(bikes3);
			collections.add(bikes4);
			collections.add(bikes5);
			collections.add(bikes6);
			collections.add(bikes7);
			collections.add(bikes8);
			collections.add(bikes9);
			collections.add(bikes10);
			collections.add(bikes11);
			collections.add(bikes12);
			collections.add(bikes13);
			
			System.out.println(collections.size());
			collections.clear();
			System.out.println("After clear....");
			System.out.println(collections.size());
		}

}
