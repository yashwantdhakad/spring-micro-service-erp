package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
