package com.Banking_Application.exception;

public class UserInvalidException extends RuntimeException {

    public UserInvalidException(String message) {
        super(message);
    }
}
