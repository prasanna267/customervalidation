package com.EmployeeDetails.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileValidator implements ConstraintValidator<Mobile,String> {


	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		 Pattern pattern = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
		 Matcher matcher = pattern.matcher("202 555 0125");
		return matcher.matches();
	}
}

