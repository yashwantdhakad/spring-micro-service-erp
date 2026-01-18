package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemRepository extends JpaRepository<BudgetItem, Long> {
}

