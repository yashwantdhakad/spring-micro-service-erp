package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemTypeRepository extends JpaRepository<BudgetItemType, Long> {
}

