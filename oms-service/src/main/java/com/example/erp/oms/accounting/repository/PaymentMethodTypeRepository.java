package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentMethodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodTypeRepository extends JpaRepository<PaymentMethodType, Long> {
}
