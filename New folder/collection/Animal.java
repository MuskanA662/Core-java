package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
	public static void main(String args[]) {
		String animal1="Cat";
		String animal2="Dog";
		String animal3="Tiger";
		String animal4="Lion";
		String animal5="Elephant";
		String animal6="Leopard";
		String animal7="Fox";
		String animal8="Kangroo";
		String animal9="Deer";
		String animal10="Sheep";
		String animal11="Horse";
		String animal12="Gorilla";
		String animal13="Panda";
		String animal14="Cow";
		String animal15="Mouse";
		
		Collection<String> animals= new ArrayList<String>();
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		animals.add(animal7);
		animals.add(animal8);
		animals.add(animal9);
		animals.add(animal10);
		animals.add(animal11);
		animals.add(animal12);
		animals.add(animal13);
		animals.add(animal14);
		animals.add(animal15);
		
		Iterator <String> itr=animals.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
		System.out.println(animals.size());
		System.out.println(animals);
	}

}