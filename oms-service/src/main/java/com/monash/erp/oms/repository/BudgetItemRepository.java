package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.BudgetItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemRepository extends JpaRepository<BudgetItem, Long> {
}