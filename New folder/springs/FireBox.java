package com.xworkz.bakery.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser
{
	@Autowired
	@Qualifier("airtel")  // setting property by proprtrty  // property injection
	private  Provider sim;  // injection-- getting reference
	
		

	
	
	
	
	public FireBox() {
		System.out.println("default cont of fire box");
	}
	
	@Override
	public void browse() {
		System.out.println("running browser in fire box");
		sim.connect();
	}
	
	

}
