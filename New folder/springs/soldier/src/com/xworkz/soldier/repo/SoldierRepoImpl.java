package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDto;

public class SoldierRepoImpl implements SoldierRepo {
		
		public SoldierRepoImpl() {
			System.out.println("Created SlodierRepoImpl using no-args constructor");
		}

		
		public boolean save(SoldierDto dto) {
			System.out.println("running save method..");
			return false;
		}

}
