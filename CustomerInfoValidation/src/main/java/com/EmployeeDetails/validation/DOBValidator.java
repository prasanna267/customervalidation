package com.EmployeeDetails.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DOBValidator implements ConstraintValidator<DOB,String> {


	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		String regex = "^(1[0-2]|0[1-9])/(3[01]"
                + "|[12][0-9]|0[1-9])/[0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher((CharSequence)value);
		return matcher.matches();
	}
}

