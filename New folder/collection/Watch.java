package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {
	public static void main(String args[]) {
		String watch1="Smartwatch";
		String watch2="Titan";
		String watch3="Fastrack";
		String watch4="Danel klein";
		String watch5="Smart band";
		
		Collection<String> watch=new ArrayList<String>();
		watch.add(watch1);
		watch.add(watch2);
		watch.add(watch3);
		watch.add(watch4);
		watch.add(watch5);
		
		Iterator <String> itr=watch.iterator();
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
		System.out.println(watch.size());
		System.out.println(watch);
	}

}
