package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.PaymentBudgetAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentBudgetAllocationRepository extends JpaRepository<PaymentBudgetAllocation, Long> {
}
