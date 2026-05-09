package com.Digi_Med.Hospital.Management.dtos;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDate;

@Data
public class PatientRegistrationRequest {

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotNull(message = "Date of birth is required")
    @Past(message = "Date of birth must be in the past")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Gender is required")
    private String gender;

    private String bloodGroup;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10,15}$", message = "Phone number must be 10-15 digits")
    private String phoneNumber;

    private String alternatePhone;

    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Address is required")
    private String addressLine1;

    private String addressLine2;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Pincode is required")
    @Pattern(regexp = "^[0-9]{4,6}$", message = "Pincode must be 4-6 digits")
    private String pincode;

    @NotBlank(message = "Country is required")
    private String country;

    private String emergencyContactName;
    private String emergencyContactNumber;
    private String emergencyContactRelation;
    private String medicalHistory;
    private String allergies;
    private String currentMedications;

    @NotBlank(message = "Login email is required")
    @Email(message = "Invalid login email format")
    private String loginEmail;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String loginPassword;
}