package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentContentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentContentTypeRepository extends JpaRepository<PaymentContentType, Long> {
}
