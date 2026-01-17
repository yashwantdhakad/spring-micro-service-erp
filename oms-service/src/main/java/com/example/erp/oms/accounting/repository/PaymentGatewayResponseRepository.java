package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewayResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayResponseRepository extends JpaRepository<PaymentGatewayResponse, Long> {
}
