package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGatewayRespMsg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayRespMsgRepository extends JpaRepository<PaymentGatewayRespMsg, Long> {
}
