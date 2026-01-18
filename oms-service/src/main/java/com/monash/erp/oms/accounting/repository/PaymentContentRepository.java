package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentContentRepository extends JpaRepository<PaymentContent, Long> {
}
