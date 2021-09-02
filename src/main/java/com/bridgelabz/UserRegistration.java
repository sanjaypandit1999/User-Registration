package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "[A-Z][a-z]{2}";
    private static final String LAST_NAME_PATTERN = "[A-Z][a-z]{2}";
    private static final String EMAIL_PATTERN = "[a-z0-9]+[.]+[a-z0-9]+[@]+[bl]+[.]+[co]+[.]+[in]+";
    public boolean validFirstName(String firstName) {
        Pattern valid = Pattern.compile(FIRST_NAME_PATTERN);
        return  valid.matcher(firstName).matches();
    }
    public boolean validLastName(String lasttName) {
        Pattern valid = Pattern.compile(LAST_NAME_PATTERN);
        return  valid.matcher(lasttName).matches();
    }
    public boolean validEmail(String email) {
        Pattern valid = Pattern.compile(EMAIL_PATTERN);
        return valid.matcher(email).matches();
    }

}
