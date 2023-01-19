package com.xworkz.FirstAid.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.FirstAid.dto.FirstAidDto;
import com.xworkz.FirstAid.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo=firstAidRepo;
		System.out.println("Created service by passing repo...");
	}

	@Override
	public boolean validateAndSave(FirstAidDto dto) {
		System.out.println("Executing validation and save start...");
		System.out.println("Dto saved..."+dto);
		
		
		Set<ConstraintViolation<FirstAidDto>> violations = this.validator.validate(dto);
				if(!violations.isEmpty()) {
					System.err.println("there are validation error");
					violations.forEach(cv ->System.out.println(cv.getMessage()));
					 return false;
				}
				else {
					System.out.println("data is valid... +can save");
					boolean saved = this.firstAidRepo.save(dto);
					System.out.println("save first aod"+saved);
					return saved;
				}
	}

}
