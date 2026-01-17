package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
