package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewayEway;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayEwayRepository extends JpaRepository<PaymentGatewayEway, Long> {
}
