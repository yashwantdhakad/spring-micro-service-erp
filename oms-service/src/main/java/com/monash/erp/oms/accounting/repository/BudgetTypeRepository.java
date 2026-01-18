package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetTypeRepository extends JpaRepository<BudgetType, Long> {
}
