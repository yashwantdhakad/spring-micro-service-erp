package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.BudgetStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetStatusRepository extends JpaRepository<BudgetStatus, Long> {
}