package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetTypeRepository extends JpaRepository<BudgetType, Long> {
}
