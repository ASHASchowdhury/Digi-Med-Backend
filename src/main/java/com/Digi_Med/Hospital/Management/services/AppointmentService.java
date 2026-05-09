package com.Digi_Med.Hospital.Management.services;


import com.Digi_Med.Hospital.Management.dtos.AppointmentRequest;
import com.Digi_Med.Hospital.Management.dtos.AppointmentResponseDTO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface AppointmentService {
    AppointmentResponseDTO bookAppointment(AppointmentRequest request);
    AppointmentResponseDTO getAppointmentById(Long id);
    List<AppointmentResponseDTO> getAppointmentsByPatientId(Long patientId);
    List<AppointmentResponseDTO> getAppointmentsByDoctorId(Long doctorId);
    List<AppointmentResponseDTO> getAppointmentsByDoctorAndDate(Long doctorId, LocalDate date);
    AppointmentResponseDTO cancelAppointment(Long id);
    AppointmentResponseDTO rescheduleAppointment(Long id, LocalDate newDate, LocalTime newTime);
    AppointmentResponseDTO completeAppointment(Long id);
    List<AppointmentResponseDTO> getAllAppointments();
}