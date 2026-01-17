package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewayCyberSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayCyberSourceRepository extends JpaRepository<PaymentGatewayCyberSource, Long> {
}
