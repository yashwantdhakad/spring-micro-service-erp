package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewayEway;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayEwayRepository extends JpaRepository<PaymentGatewayEway, Long> {
}
