package com.Digi_Med.Hospital.Management.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private Double amount;
    private String currency = "BDT";
    private String status; // PENDING, COMPLETED, FAILED, REFUNDED
    private String paymentMethod; // BKASH, NAGAD, CARD, BANK
    private String transactionId;
    private String paymentNumber;
    private LocalDateTime paymentDate;
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        paymentDate = LocalDateTime.now();
    }
}