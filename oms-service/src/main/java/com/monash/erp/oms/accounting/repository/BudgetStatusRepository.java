package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetStatusRepository extends JpaRepository<BudgetStatus, Long> {
}
