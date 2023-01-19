package com.xworkz.mesile.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mesile.dto.MesileDto;
import com.xworkz.mesile.repository.MesileRepo;

@Component
public class MesileServiceImpl implements MesileService {
	@Autowired
	private Validator validator;
	private MesileRepo mesileRepo;
	
	@Autowired
	public MesileServiceImpl(MesileRepo mesileRepo) {
		this.mesileRepo=mesileRepo;
		System.out.println("Created service by passing repo...");
	}

	@Override
	public boolean validateAndSave(MesileDto dto) {
		System.out.println("Executing validation and save start...");
		System.out.println("Dto saved..."+dto);
		
		
		Set<ConstraintViolation<MesileDto>> violations = this.validator.validate(dto);
				if(!violations.isEmpty()) {
					System.err.println("there are validation error");
					violations.forEach(cv ->System.out.println(cv.getMessage()));
					 return false;
				}
				else {
					System.out.println("data is valid... +can save");
					boolean saved = this.mesileRepo.save(dto);
					System.out.println("save mesile"+saved);
					return saved;
				}
	}
}