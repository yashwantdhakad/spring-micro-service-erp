package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewayRespMsg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayRespMsgRepository extends JpaRepository<PaymentGatewayRespMsg, Long> {
}
