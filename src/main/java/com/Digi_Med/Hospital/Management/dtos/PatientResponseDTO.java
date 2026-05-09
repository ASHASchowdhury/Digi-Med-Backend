package com.Digi_Med.Hospital.Management.dtos;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PatientResponseDTO {
    private Long id;
    private String registrationNumber;
    private String firstName;
    private String lastName;
    private String fullName;
    private LocalDate dateOfBirth;
    private Integer age;
    private String gender;
    private String bloodGroup;
    private String phoneNumber;
    private String email;
    private String city;
    private String status;
    private LocalDateTime registrationDate;
}