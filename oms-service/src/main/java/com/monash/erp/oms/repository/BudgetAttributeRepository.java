package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.BudgetAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetAttributeRepository extends JpaRepository<BudgetAttribute, Long> {
}