package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetRevision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRevisionRepository extends JpaRepository<BudgetRevision, Long> {
}
