package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetStatusRepository extends JpaRepository<BudgetStatus, Long> {
}
