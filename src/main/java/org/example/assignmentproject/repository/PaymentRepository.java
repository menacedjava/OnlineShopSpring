package org.example.assignmentproject.repository;

import org.example.assignmentproject.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
