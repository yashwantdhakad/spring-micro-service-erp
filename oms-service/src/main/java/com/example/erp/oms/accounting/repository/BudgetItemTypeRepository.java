package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemTypeRepository extends JpaRepository<BudgetItemType, Long> {
}
