package com.Digi_Med.Hospital.Management.repository;

import com.Digi_Med.Hospital.Management.models.ChatMessage;
import com.Digi_Med.Hospital.Management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findBySenderAndReceiverOrderBySentAtAsc(User sender, User receiver);
    List<ChatMessage> findByPatient_IdAndDoctor_IdOrderBySentAtAsc(Long patientId, Long doctorId);
    List<ChatMessage> findByReceiverAndIsReadFalse(User receiver);
}