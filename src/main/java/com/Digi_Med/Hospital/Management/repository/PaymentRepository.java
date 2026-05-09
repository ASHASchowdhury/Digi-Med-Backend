package com.Digi_Med.Hospital.Management.repository;

import com.Digi_Med.Hospital.Management.models.Payment;
import com.Digi_Med.Hospital.Management.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByTransactionId(String transactionId);
    List<Payment> findByPatient(Patient patient);
    List<Payment> findByStatus(String status);
}