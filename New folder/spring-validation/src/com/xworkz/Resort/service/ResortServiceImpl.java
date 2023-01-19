package com.xworkz.Resort.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.Resort.dto.ResortDto;
import com.xworkz.Resort.repository.ResortRepo;
import com.xworkz.mesile.dto.MesileDto;

@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo=resortRepo;
		System.out.println("Created service by passing repo...");
	}

	@Override
	public boolean validateAndSave1(ResortDto dto) {
		System.out.println("Executing validation and save start...");
		System.out.println("Dto saved..."+dto);
		
		
		Set<ConstraintViolation<ResortDto>> violations = this.validator.validate(dto);
				if(!violations.isEmpty()) {
					System.err.println("there are validation error");
					violations.forEach(cv ->System.err.println(cv.getMessage()));
					 return false;
				}
				else {
					System.out.println("data is valid... +can save");
					boolean saved = this.resortRepo.save(dto);
					System.out.println("save resort"+saved);
					return saved;
				}
	}


}