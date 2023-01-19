package com.xworkz.FirstAid.repository;

import org.springframework.stereotype.Component;

import com.xworkz.FirstAid.dto.FirstAidDto;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean save(FirstAidDto dto) {
	System.out.println("running save in repo...");
	System.out.println("Firstaid dto"+dto);
		return true;
	}

}
