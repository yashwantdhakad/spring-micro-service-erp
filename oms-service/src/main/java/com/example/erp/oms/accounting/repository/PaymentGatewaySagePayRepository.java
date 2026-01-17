package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewaySagePay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewaySagePayRepository extends JpaRepository<PaymentGatewaySagePay, Long> {
}
