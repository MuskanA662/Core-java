package com.xworkz.assignmentsapp;

import java.util.Scanner;

public class PalindromeStr {
	public static void main(String[] args) {
		String str= "";
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a string");
	    String a = sc.next();
	    
	    char[] ch=a.toCharArray();
	    for (int i=ch.length-1;i>=0;i--) {
	    	System.out.println(ch[i]);
	    	str=str+ch[i];
	    	
	    }
	    if(a.equals(str)) {
	    	System.out.println("palindrome");
	    }
	    else {
	    	System.out.println("not a palindrome");
	    }
		
	/*	StringBuffer abc = new StringBuffer(a);
		/*StringBuffer
		abc.reverse();
		String newData =abc.toString();
		if(a.equals(newData)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
	}*/
	    
		

}
}
