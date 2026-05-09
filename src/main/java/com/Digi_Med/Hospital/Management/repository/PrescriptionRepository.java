package com.Digi_Med.Hospital.Management.repository;


import com.Digi_Med.Hospital.Management.models.Prescription;
import com.Digi_Med.Hospital.Management.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    List<Prescription> findByPatient(Patient patient);
    List<Prescription> findByPatientOrderByCreatedAtDesc(Patient patient);
    boolean existsByPrescriptionNumber(String prescriptionNumber);
}