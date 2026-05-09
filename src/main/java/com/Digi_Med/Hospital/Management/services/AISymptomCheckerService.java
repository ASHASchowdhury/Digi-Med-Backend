package com.Digi_Med.Hospital.Management.services;

import com.Digi_Med.Hospital.Management.dtos.SymptomRequest;
import com.Digi_Med.Hospital.Management.dtos.SymptomResponse;

public interface AISymptomCheckerService {
    SymptomResponse analyzeSymptoms(SymptomRequest request);
}