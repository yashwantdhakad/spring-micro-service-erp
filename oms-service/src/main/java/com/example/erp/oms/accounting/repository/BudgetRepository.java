package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}

