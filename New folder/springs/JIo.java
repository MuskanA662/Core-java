package com.xworkz.bakery.component;

import org.springframework.stereotype.Component;
@Component
public class JIo implements Provider {

	public JIo() {
System.out.println("running default const of jio");	
}
	
	
	
	@Override
	public void connect() {
System.out.println("running connector in jio");		
	}

}
