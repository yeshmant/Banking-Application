package com.Banking_Application.dto;

public record FundTransferRequest (String sourceAccountNumber, String targetAccountNumber, double amount, String pin) {
    
}
