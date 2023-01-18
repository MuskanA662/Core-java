package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bakery.component")
public class Confy {
	
	public Confy() {
System.out.println("running default const of confy");	

}

	
}
