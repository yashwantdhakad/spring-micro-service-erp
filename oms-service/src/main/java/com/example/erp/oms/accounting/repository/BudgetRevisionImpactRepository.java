package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetRevisionImpact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRevisionImpactRepository extends JpaRepository<BudgetRevisionImpact, Long> {
}
