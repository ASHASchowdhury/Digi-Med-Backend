package com.Digi_Med.Hospital.Management.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SymptomRequest {
    @NotBlank(message = "Symptoms are required")
    private String symptoms;

    private Long patientId;
    private Integer age;
    private String gender;
    private String existingConditions;
}
