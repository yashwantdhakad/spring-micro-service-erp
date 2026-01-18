package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewayWorldPay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayWorldPayRepository extends JpaRepository<PaymentGatewayWorldPay, Long> {
}
