package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentGatewayWorldPay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayWorldPayRepository extends JpaRepository<PaymentGatewayWorldPay, Long> {
}