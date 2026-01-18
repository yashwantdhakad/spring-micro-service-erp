package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
