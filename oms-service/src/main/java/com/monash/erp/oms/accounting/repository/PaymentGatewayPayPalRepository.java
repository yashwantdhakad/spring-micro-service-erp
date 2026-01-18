package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewayPayPal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayPayPalRepository extends JpaRepository<PaymentGatewayPayPal, Long> {
}
