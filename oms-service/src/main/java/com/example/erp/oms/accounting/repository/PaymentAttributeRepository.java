package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentAttributeRepository extends JpaRepository<PaymentAttribute, Long> {
}
