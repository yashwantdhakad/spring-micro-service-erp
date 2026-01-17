package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetAttributeRepository extends JpaRepository<BudgetAttribute, Long> {
}
