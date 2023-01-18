package com.xworkz.bakery.component;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{

	public Airtel() {
		System.out.println("running default const of Airtel");		}
	
	@Override
	public void connect() {
System.out.println("runnnig connector in airtel");		
	}

}
