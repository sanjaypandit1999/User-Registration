package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "[A-Z][a-z]{2}";
    public boolean validateFirstName(String firstName) {
        boolean pattern = Pattern.compile(FIRST_NAME_PATTERN).matcher(firstName).matches();
        return true;
    }
}
