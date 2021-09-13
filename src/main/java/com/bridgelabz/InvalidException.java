package com.bridgelabz;

public class InvalidException extends RuntimeException {
    public enum ExceptionType {
        INVALIDFIRSTNAME, INVALIDLASTNAME, INVALIDEMAIL, INVALIDPHNNO, INVALIDPASSWORD
    }
    public ExceptionType type;

    public InvalidException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
