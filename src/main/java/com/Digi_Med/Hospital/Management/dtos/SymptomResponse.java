package com.Digi_Med.Hospital.Management.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SymptomResponse {
    private String analysis;
    private String recommendations;
    private String suggestedSpecialization;
    private String severity;
    private String disclaimer;
}