package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}