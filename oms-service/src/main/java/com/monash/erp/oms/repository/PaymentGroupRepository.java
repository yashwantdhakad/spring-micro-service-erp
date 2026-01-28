package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGroupRepository extends JpaRepository<PaymentGroup, Long> {
}