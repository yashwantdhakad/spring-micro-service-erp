package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetAttributeRepository extends JpaRepository<BudgetAttribute, Long> {
}

