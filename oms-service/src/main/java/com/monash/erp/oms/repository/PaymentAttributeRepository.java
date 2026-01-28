package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentAttributeRepository extends JpaRepository<PaymentAttribute, Long> {
}