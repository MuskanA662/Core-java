package com.xworkz.collectionapp;

import java.util.TreeSet;

public class Sweets {
	public static void main(String args[]) {
		String sweet1="kaju katli";
		String sweet2="jalebi";
		String sweet3="jahangeer";
		String sweet4="pede";
		String sweet5="rasgulla";
		String sweet6="barfi";
		String sweet7="son papadi";
		String sweet8="gulab jamun";
		String sweet9="rasmalayi";
		String sweet10="milk peda";
		String sweet11="milk cake";
		String sweet12="pastry";
		String sweet13="mysorepak";
		String sweet14="shreekhand";
		String sweet15="basundi";
		String sweet16="dilkhush";
		String sweet17="balusha";
		String sweet18="makkhan peda";
		String sweet19="motichur laddu";
		String sweet20="sheerkurma";
		
		TreeSet<String> collections=new TreeSet<String>();
		
		collections.add(sweet1);
		collections.add(sweet2);
		collections.add(sweet3);
		collections.add(sweet4);
		collections.add(sweet5);
		collections.add(sweet6);
		collections.add(sweet7);
		collections.add(sweet8);
		collections.add(sweet9);
		collections.add(sweet10);
		collections.add(sweet11);
		collections.add(sweet12);
		collections.add(sweet13);
		collections.add(sweet14);
		collections.add(sweet15);
		collections.add(sweet16);
		collections.add(sweet17);
		collections.add(sweet18);
		collections.add(sweet19);
		collections.add(sweet20);
		
		System.out.println(collections.size());
		collections.clear();
		System.out.println("After clear....");
		System.out.println(collections.size());
		
	}

}
