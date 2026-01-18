package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}

