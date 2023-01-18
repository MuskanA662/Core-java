package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.dto.TerroristDto;
import com.xworkz.terrorist.service.TerroristService;
import com.xworkz.terrorist.service.TerroristServiceImpl;

public class Runner {
	public static void main(String[] args) {

		TerroristDto dto = new TerroristDto("muskan", 23, "India", true, false, "allrounder", "Xworkz");
		System.out.println(dto);

		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(dto);


		}

	

}
