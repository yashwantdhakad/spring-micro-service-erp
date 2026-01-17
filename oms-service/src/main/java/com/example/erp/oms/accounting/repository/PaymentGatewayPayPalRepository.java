package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewayPayPal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayPayPalRepository extends JpaRepository<PaymentGatewayPayPal, Long> {
}
