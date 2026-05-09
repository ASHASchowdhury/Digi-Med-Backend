package com.Digi_Med.Hospital.Management.repository;

import com.Digi_Med.Hospital.Management.models.Appointment;
import com.Digi_Med.Hospital.Management.models.Patient;
import com.Digi_Med.Hospital.Management.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatient(Patient patient);
    List<Appointment> findByDoctor(Doctor doctor);
    List<Appointment> findByPatientAndStatus(Patient patient, String status);
    List<Appointment> findByDoctorAndStatus(Doctor doctor, String status);
    List<Appointment> findByAppointmentDate(LocalDate date);
    List<Appointment> findByDoctorAndAppointmentDate(Doctor doctor, LocalDate date);

    @Query("SELECT a FROM Appointment a WHERE a.doctor.id = :doctorId AND a.appointmentDate = :date")
    List<Appointment> findDoctorAppointmentsByDate(@Param("doctorId") Long doctorId, @Param("date") LocalDate date);
}