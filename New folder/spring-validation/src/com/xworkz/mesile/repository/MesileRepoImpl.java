package com.xworkz.mesile.repository;

import org.springframework.stereotype.Component;

import com.xworkz.mesile.dto.MesileDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component

public class MesileRepoImpl implements MesileRepo {
	

		
		@Override
		public boolean save(MesileDto dto) {
			System.out.println("running save in repo...");
			System.out.println("Firstaid dto"+dto);
				return true;
		}


}
