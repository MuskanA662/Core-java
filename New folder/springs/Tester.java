package com.xworkz.bakery.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bakery.component.Browser;
import com.xworkz.bakery.component.FireBox;
import com.xworkz.bakery.configuration.Confy;

public class Tester {
	public static void main(String[] args) {
		
		ApplicationContext bucket=new AnnotationConfigApplicationContext(Confy.class);
		
	Browser b=	bucket.getBean(FireBox.class);  // abstraction
	b.browse();
		
		
	}

}
