package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentGatewayPayPal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayPayPalRepository extends JpaRepository<PaymentGatewayPayPal, Long> {
}