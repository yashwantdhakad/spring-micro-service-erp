package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentContentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentContentTypeRepository extends JpaRepository<PaymentContentType, Long> {
}
