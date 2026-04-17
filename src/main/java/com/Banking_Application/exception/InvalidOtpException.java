package com.Banking_Application.exception;

public class InvalidOtpException extends RuntimeException {

    public InvalidOtpException(String msg) {
        super(msg);
    }
}
