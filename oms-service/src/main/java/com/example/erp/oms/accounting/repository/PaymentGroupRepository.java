package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGroupRepository extends JpaRepository<PaymentGroup, Long> {
}
