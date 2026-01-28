package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.BudgetItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemTypeRepository extends JpaRepository<BudgetItemType, Long> {
}