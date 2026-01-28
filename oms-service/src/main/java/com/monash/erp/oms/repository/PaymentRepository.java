package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}