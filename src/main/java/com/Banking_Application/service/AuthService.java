package com.Banking_Application.service;

import org.springframework.http.ResponseEntity;

import com.Banking_Application.dto.OtpRequest;
import com.Banking_Application.dto.OtpVerificationRequest;
import com.Banking_Application.dto.ResetPasswordRequest;
import com.Banking_Application.entity.User;

public interface AuthService {
    public String generatePasswordResetToken(User user);

    public boolean verifyPasswordResetToken(String token, User user);

    public void deletePasswordResetToken(String token);

    public ResponseEntity<String> sendOtpForPasswordReset(OtpRequest otpRequest);

    public ResponseEntity<String> verifyOtpAndIssueResetToken(OtpVerificationRequest otpVerificationRequest);

    public ResponseEntity<String> resetPassword(ResetPasswordRequest resetPasswordRequest);

}
