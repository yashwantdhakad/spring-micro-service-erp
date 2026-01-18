package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PayPalPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayPalPaymentMethodRepository extends JpaRepository<PayPalPaymentMethod, Long> {
}
