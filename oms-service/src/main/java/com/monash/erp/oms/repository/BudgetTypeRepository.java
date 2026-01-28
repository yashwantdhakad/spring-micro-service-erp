package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.BudgetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetTypeRepository extends JpaRepository<BudgetType, Long> {
}