package com.Banking_Application.dto;

public record PinUpdateRequest(String accountNumber, String oldPin, String newPin, String password) {
}
