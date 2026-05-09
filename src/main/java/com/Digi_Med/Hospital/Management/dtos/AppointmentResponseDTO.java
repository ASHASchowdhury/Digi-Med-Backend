package com.Digi_Med.Hospital.Management.dtos;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class AppointmentResponseDTO {
    private Long id;
    private String appointmentNumber;
    private Long patientId;
    private String patientName;
    private Long doctorId;
    private String doctorName;
    private String specialization;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String status;
    private String symptoms;
    private String notes;
    private LocalDateTime createdAt;
}