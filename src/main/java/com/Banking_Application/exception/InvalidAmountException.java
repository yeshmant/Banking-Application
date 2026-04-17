package com.Banking_Application.exception;

public class InvalidAmountException extends RuntimeException {
    
    public InvalidAmountException(String message) {
        super(message);
    }
}
