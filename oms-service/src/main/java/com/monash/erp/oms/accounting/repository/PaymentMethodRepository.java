package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
