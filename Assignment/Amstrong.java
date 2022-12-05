package com.xworkz.assignmentsapp;

import java.util.Scanner;

public class Amstrong {
public static void main(String args[]) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	
	int originalNumber,reminder,result=0;
	originalNumber=number;
	while(originalNumber!=0)
	{
		reminder=originalNumber%10;
		result=(int) (result+Math.pow(reminder, 3));
		originalNumber/=10;
	}
	if(result==number)
	{
		System.out.println("Amstrong");	
	}
	else {
		System.out.println("not amstrong");
	}
	
}
}
