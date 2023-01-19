package com.xworkz.Resort.repository;

import org.springframework.stereotype.Component;

import com.xworkz.Resort.dto.ResortDto;
//import com.xworkz.mesile.dto.MesileDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class ResortRepoImpl implements ResortRepo{			
			@Override
			public boolean save(ResortDto dto) {
				System.out.println("running save in repo...");
				System.out.println("Firstaid dto"+dto);
					return true;
			}
}
