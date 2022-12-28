package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {
	public static void main(String args[]) {
		String shoe1="10";
		String shoe2="9";
		String shoe3="8";
		String shoe4="7";
		String shoe5="6";
		String shoe6="46";
		String shoe7="40";
		String shoe8="42";
		String shoe9="43";
		String shoe10="44";
		String shoe11="4";
		String shoe12="5";
		String shoe13="48";
		String shoe14="30";
		String shoe15="32";
		
		
		Collection<String> shoe=new ArrayList<String>();
		shoe.add(shoe1);
		shoe.add(shoe2);
		shoe.add(shoe3);
		shoe.add(shoe4);
		shoe.add(shoe5);
		shoe.add(shoe6);
		shoe.add(shoe7);
		shoe.add(shoe8);
		shoe.add(shoe9);
		shoe.add(shoe10);
		shoe.add(shoe11);
		shoe.add(shoe12);
		shoe.add(shoe13);
		shoe.add(shoe14);
		shoe.add(shoe15);
		
		Iterator <String> itr=shoe.iterator();
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
		System.out.println(shoe.size());
		System.out.println(shoe);
	}

}
