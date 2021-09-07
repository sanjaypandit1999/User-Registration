package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validFirstName(String firstName) {
        String FIRST_NAME_PATTERN = "[A-Z][a-z]{2,}";
        Pattern valid = Pattern.compile(FIRST_NAME_PATTERN);
        return  valid.matcher(firstName).matches();
    }

    public boolean validLastName(String lasttName) {
        String LAST_NAME_PATTERN = "[A-Z][a-z]{2,}";
        Pattern valid = Pattern.compile(LAST_NAME_PATTERN);
        return  valid.matcher(lasttName).matches();
    }

    public boolean validEmail(String email) {
        String EMAIL_PATTERN = "[a-z0-9]+[\\-\\+\\.]?[a-z0-9]*[@][a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,2}";
        Pattern valid = Pattern.compile(EMAIL_PATTERN);
        return valid.matcher(email).matches();
    }
    public boolean validPhnNo(String phNo) {
        String PHONENO_PATTERN = "[91]{2}[ ][0-9]{10}";
        Pattern valid = Pattern.compile(PHONENO_PATTERN);
        return valid.matcher(phNo).matches();
    }

    public boolean validPassWord(String password) {
        String PASSWORD_PATTERN =  "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8}";
        Pattern valid = Pattern.compile(PASSWORD_PATTERN);
        return valid.matcher(password).matches();
    }
    public String validatedUserRegistration(String firstName, String lastName,
                                            String emailId, String mobileNo, String password) {
        if (validFirstName(firstName) && validLastName(lastName) &&
                validEmail(emailId) && validPhnNo(mobileNo) && validPassWord(password)) {
            return "HAPPY";
        }
        else {
            return "SAD";
        }
    }
}
