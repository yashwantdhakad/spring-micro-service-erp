package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemAttributeRepository extends JpaRepository<BudgetItemAttribute, Long> {
}

