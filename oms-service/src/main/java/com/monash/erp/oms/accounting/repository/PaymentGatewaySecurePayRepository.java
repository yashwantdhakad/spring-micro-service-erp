package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewaySecurePay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewaySecurePayRepository extends JpaRepository<PaymentGatewaySecurePay, Long> {
}
