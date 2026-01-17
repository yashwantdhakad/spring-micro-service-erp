package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewaySecurePay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewaySecurePayRepository extends JpaRepository<PaymentGatewaySecurePay, Long> {
}
