package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentAttributeRepository extends JpaRepository<PaymentAttribute, Long> {
}
