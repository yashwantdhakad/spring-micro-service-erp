package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentGroupType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGroupTypeRepository extends JpaRepository<PaymentGroupType, Long> {
}
