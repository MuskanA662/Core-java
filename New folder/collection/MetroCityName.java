package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityName {
	public static void main(String args[]) {
		String city1="Bangalore";
		String city2="Mysore";
		String city3="Delhi";
		String city4="pune";
		String city5="Mumbai";
		
		Collection<String> city=new ArrayList<String>();
		city.add(city1);
		city.add(city2);
		city.add(city3);
		city.add(city4);
		city.add(city5);
		
		Iterator <String> itr=city.iterator();
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
		System.out.println(city.size());
		System.out.println(city);
	}

}



