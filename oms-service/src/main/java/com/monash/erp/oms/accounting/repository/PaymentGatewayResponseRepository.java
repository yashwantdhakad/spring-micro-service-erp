package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewayResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayResponseRepository extends JpaRepository<PaymentGatewayResponse, Long> {
}
