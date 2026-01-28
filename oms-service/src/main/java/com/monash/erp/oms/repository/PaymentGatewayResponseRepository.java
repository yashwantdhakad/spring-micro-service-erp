package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentGatewayResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayResponseRepository extends JpaRepository<PaymentGatewayResponse, Long> {
}