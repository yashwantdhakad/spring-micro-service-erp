package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PayPalPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayPalPaymentMethodRepository extends JpaRepository<PayPalPaymentMethod, Long> {
}