package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewaySagePay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewaySagePayRepository extends JpaRepository<PaymentGatewaySagePay, Long> {
}
