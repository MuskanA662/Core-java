package com.xworkz.collectionapp;

import java.util.TreeSet;

public class Currency {
	public static void main(String args[]) {
		String cur1="abc";
		String cur2="Rupay";
		String cur3="Ringitt";
		String cur4="Bin";
		String cur5="Krone";
		String cur6="New Reil";
		String cur7="Peso.";
		String cur8="Kroon";
		String cur9="Nepali Rupees";
		String cur10="pound";
		String cur11="riyal";
		String cur12="som";
		String cur13="rial";
		String cur14="manat";
		String cur15="dollar";
		String cur16="Real";
		String cur17="Leva";
		String cur18="Franc";
		String cur19="Kuna";
		String cur20="Lek";
		String cur21="Peso";
		String cur22="Taka";
		String cur23="Euro";
		String cur24="dinar";
		String cur25="afgani";
		String cur26="dollar";
		
		TreeSet<String> collections=new TreeSet<String>();
		
		collections.add(cur1);
		collections.add(cur2);
		collections.add(cur3);
		collections.add(cur4);
		collections.add(cur5);
		collections.add(cur6);
		collections.add(cur7);
		collections.add(cur8);
		collections.add(cur9);
		collections.add(cur10);
		collections.add(cur11);
		collections.add(cur12);
		collections.add(cur13);
		collections.add(cur14);
		collections.add(cur15);
		collections.add(cur16);
		collections.add(cur17);
		collections.add(cur18);
		collections.add(cur19);
		collections.add(cur20);
		collections.add(cur21);
		collections.add(cur22);
		collections.add(cur23);
		collections.add(cur24);
		collections.add(cur25);
		collections.add(cur26);
		
		System.out.println(collections.size());
		collections.clear();
		System.out.println("After clear....");
		System.out.println(collections.size());
	}

}
