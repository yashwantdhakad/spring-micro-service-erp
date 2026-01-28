package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.PaymentBudgetAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentBudgetAllocationRepository extends JpaRepository<PaymentBudgetAllocation, Long> {
}