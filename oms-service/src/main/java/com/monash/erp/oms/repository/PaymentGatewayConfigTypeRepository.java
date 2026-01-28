package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentGatewayConfigType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayConfigTypeRepository extends JpaRepository<PaymentGatewayConfigType, Long> {
}