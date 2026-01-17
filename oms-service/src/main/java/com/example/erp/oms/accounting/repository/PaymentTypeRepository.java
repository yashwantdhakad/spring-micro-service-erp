package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long> {
}
