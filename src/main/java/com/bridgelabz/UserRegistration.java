package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validFirstName(String firstName) {
        String firstNamePattern = "[A-Z][a-z]{2,}";
        Pattern valid = Pattern.compile(firstNamePattern);
        if(!valid.matcher(firstName).matches()){
            throw new InvalidException("Invalid Message" , InvalidException.ExceptionType.INVALIDFIRSTNAME);
        }
        else {
            return true;
        }
    }

    public boolean validLastName(String lasttName) {
        String lastNamePattern = "[A-Z][a-z]{2,}";
        Pattern valid = Pattern.compile(lastNamePattern);
        if(!valid.matcher(lasttName).matches()){
            throw new InvalidException("Invalid lastname", InvalidException.ExceptionType.INVALIDLASTNAME);
        }
        else{
            return true;
        }
    }

    public boolean validEmail(String email) {
        String emailPattern = "[a-z0-9]+[\\-\\+\\.]?[a-z0-9]*[@][a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,2}";
        Pattern valid = Pattern.compile(emailPattern);
        if(!valid.matcher(email).matches()){
            throw new InvalidException("Invalid email", InvalidException.ExceptionType.INVALIDEMAIL);
        }
        else {
            return true;
        }
    }
    public boolean validPhnNo(String phNo) {
        String phnNoPattern = "[91]{2}[ ][0-9]{10}";
        Pattern valid = Pattern.compile(phnNoPattern);
        if(!valid.matcher(phNo).matches()){
            throw new InvalidException("Invalid Phone No", InvalidException.ExceptionType.INVALIDPHNNO);
        }
        else {
            return true;
        }
    }

    public boolean validPassWord(String password) {
        String passwordPattern =  "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8}";
        Pattern valid = Pattern.compile(passwordPattern);
        if (!valid.matcher(password).matches()){
            throw new InvalidException("Invalid password", InvalidException.ExceptionType.INVALIDPASSWORD);
        }
        else {
            return true;
        }
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
