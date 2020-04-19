package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("beforeCreateAlienValidator")
public class AlienValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Alien.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		log.info("Validate Alien Before Create....");
		ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
		
		Alien p = (Alien) target;
        if (p.getAge() < 0) {
        	errors.rejectValue("age", "negativevalue");
        } else if (p.getAge() > 1000) {
        	errors.rejectValue("age", "too.darn.old");
        }
	}
}