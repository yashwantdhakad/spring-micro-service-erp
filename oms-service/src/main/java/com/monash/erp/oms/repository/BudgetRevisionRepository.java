package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.BudgetRevision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRevisionRepository extends JpaRepository<BudgetRevision, Long> {
}