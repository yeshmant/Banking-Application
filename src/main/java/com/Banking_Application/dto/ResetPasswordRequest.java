package com.Banking_Application.dto;

public record ResetPasswordRequest(String identifier, String resetToken, String newPassword) {
}
