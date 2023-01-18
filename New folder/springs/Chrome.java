package com.xworkz.bakery.component;

import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser{

	
	public Chrome() {
		System.out.println("default cont of chrome");
	}
	@Override
	public void browse() {
		System.out.println("rinning browser in chrome");
		
	}

}
