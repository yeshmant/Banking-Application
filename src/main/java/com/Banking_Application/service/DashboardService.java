package com.Banking_Application.service;

import com.Banking_Application.dto.AccountResponse;
import com.Banking_Application.dto.UserResponse;

public interface DashboardService {
    UserResponse getUserDetails(String accountNumber);
    AccountResponse getAccountDetails(String accountNumber);
}