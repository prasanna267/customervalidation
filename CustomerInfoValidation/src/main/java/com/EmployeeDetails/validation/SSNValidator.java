package com.EmployeeDetails.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SSNValidator implements ConstraintValidator<SSN,String> {


	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// Regex to check SSN
        // (Social Security Number).
        String regex = "^(?!666|000|9\\d{2})\\d{3}"
                       + "-(?!00)\\d{2}-"
                       +"(?!0{4})\\d{4}$";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (value == null)
        {
            return false;
        }
 
        // Pattern class contains matcher()
        //  method to find matching between
        //  given string and regular expression.
        Matcher m = p.matcher(value);
 
        // Return if the string
        // matched the ReGex
        return m.matches();

	}
}

