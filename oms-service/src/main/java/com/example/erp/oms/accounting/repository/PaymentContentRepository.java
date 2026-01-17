package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentContentRepository extends JpaRepository<PaymentContent, Long> {
}
