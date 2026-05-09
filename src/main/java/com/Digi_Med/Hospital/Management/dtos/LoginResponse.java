package com.Digi_Med.Hospital.Management.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private boolean success;
    private String message;
    private String email;
    private String fullName;
    private String role;
    private Long userId;
}