package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewayConfigType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayConfigTypeRepository extends JpaRepository<PaymentGatewayConfigType, Long> {
}
