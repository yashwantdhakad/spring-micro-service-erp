package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long> {
}
