package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terrorist.dto.TerroristDto;

public class TerroristServiceImpl implements TerroristService {
	@Override
	public boolean validateAndSave(TerroristDto dto) {

	System.out.println("executing validateAndSave start");
	System.out.println("Dto passed " + dto);

	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();
	Set<ConstraintViolation<TerroristDto>> violations = validator.validate(dto);
	if(!violations.isEmpty()) {
	System.out.println("Error is there");
	violations.forEach(c -> System.out.println(c.getMessage()));
	return false;
	}
	else {
	System.out.println("Validation is successfull");
	return true;
	}

}
}
