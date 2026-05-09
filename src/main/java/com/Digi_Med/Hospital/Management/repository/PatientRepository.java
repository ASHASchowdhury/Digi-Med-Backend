package com.Digi_Med.Hospital.Management.repository;

import com.Digi_Med.Hospital.Management.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByPhoneNumber(String phoneNumber);
    Optional<Patient> findByRegistrationNumber(String registrationNumber);
    Optional<Patient> findByUser_Email(String email);
    boolean existsByPhoneNumber(String phoneNumber);

    List<Patient> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
    List<Patient> findByCity(String city);
    List<Patient> findByStatus(String status);

    @Query("SELECT p FROM Patient p WHERE p.firstName LIKE %:name% OR p.lastName LIKE %:name%")
    List<Patient> searchByName(@Param("name") String name);
}