package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetRevisionImpact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRevisionImpactRepository extends JpaRepository<BudgetRevisionImpact, Long> {
}
