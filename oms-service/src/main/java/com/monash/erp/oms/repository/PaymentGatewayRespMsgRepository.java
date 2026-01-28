package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentGatewayRespMsg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayRespMsgRepository extends JpaRepository<PaymentGatewayRespMsg, Long> {
}