package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewayWorldPay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayWorldPayRepository extends JpaRepository<PaymentGatewayWorldPay, Long> {
}
