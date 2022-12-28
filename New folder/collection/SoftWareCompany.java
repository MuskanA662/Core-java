package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftWareCompany {
	public static void main(String args[]) {
		String comapny1="Google";
		String comapny2="Microsoft";
		String comapny3="hcl";
		String comapny4="acuvate";
		String comapny5="Dirst american india";
		String comapny6="zomato";
		String comapny7="juspay";
		String comapny8="flipkart";
		String comapny9="amazon";
		String comapny10="ajio";
		String comapny11="Easyshoping";
		String comapny12="meesho";
		String comapny13="mindtree";
		String comapny14="fastrack";
		String comapny15="vivo";
		String comapny16="samsung";
		String comapny17="jio";
		String comapny18="reliance";
		String comapny19="sansui";
		String comapny20="sawd";
		
		
		Collection<String> comapny=new ArrayList<String>();
		comapny.add(comapny1);
		comapny.add(comapny2);
		comapny.add(comapny3);
		comapny.add(comapny4);
		comapny.add(comapny5);
		comapny.add(comapny6);
		comapny.add(comapny7);
		comapny.add(comapny8);
		comapny.add(comapny9);
		comapny.add(comapny10);
		comapny.add(comapny11);
		comapny.add(comapny12);
		comapny.add(comapny13);
		comapny.add(comapny14);
		comapny.add(comapny15);
		comapny.add(comapny16);
		comapny.add(comapny17);
		comapny.add(comapny18);
		comapny.add(comapny19);
		comapny.add(comapny20);
		
		Iterator <String> itr=comapny.iterator();
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
		System.out.println(comapny.size());
		System.out.println(comapny);
	}

}
