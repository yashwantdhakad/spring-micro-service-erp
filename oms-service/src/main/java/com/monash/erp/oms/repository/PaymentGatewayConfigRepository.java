package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentGatewayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayConfigRepository extends JpaRepository<PaymentGatewayConfig, Long> {
}