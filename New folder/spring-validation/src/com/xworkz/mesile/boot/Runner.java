package com.xworkz.mesile.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.FirstAid.configuration.SpringConfiguration;
import com.xworkz.mesile.dto.MesileDto;
import com.xworkz.mesile.service.MesileService;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MesileService service =container.getBean(MesileService.class);
		boolean saved = service.validateAndSave(new MesileDto());
		System.out.println("saved"+saved);
		
	}

}
