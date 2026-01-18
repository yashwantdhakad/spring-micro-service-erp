package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGatewayClearCommerce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayClearCommerceRepository extends JpaRepository<PaymentGatewayClearCommerce, Long> {
}
