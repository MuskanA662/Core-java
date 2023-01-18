package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.service.SoldierServiceImpl;
import com.xworkz.soldier.repo.SoldierRepoImpl;

public class SoldierRunner {
	
		
		public static void main(String[] args) {
			
			SoldierDto dto = new SoldierDto("Sanket", 2, "FirstRank", "BGMIT", "India");
			
			SoldierServiceImpl service = new SoldierServiceImpl();
			SoldierRepo repo = new SoldierRepoImpl();
			service.setSoldierRepo(repo);
			service.validateAndSave(dto);
			
			
		
	}

}
