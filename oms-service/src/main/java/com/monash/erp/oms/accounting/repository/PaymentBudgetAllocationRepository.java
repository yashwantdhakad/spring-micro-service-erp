package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.PaymentBudgetAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentBudgetAllocationRepository extends JpaRepository<PaymentBudgetAllocation, Long> {
}
