package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentMethodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodTypeRepository extends JpaRepository<PaymentMethodType, Long> {
}