package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayConfigRepository extends JpaRepository<PaymentGatewayConfig, Long> {
}
