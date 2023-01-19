package com.xworkz.Resort.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.FirstAid.configuration.SpringConfiguration;
import com.xworkz.Resort.dto.ResortDto;
import com.xworkz.Resort.service.ResortService;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortService service =container.getBean(ResortService.class);
		boolean saved = service.validateAndSave1(new ResortDto());
		System.out.println("saved"+saved);
		
	}


}
