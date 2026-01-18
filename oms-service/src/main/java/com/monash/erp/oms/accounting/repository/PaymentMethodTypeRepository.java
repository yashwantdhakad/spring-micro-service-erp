package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentMethodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodTypeRepository extends JpaRepository<PaymentMethodType, Long> {
}
