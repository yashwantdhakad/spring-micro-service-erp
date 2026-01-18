package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetRevision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRevisionRepository extends JpaRepository<BudgetRevision, Long> {
}
