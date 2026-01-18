package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewayCyberSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayCyberSourceRepository extends JpaRepository<PaymentGatewayCyberSource, Long> {
}
