package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetItemRepository extends JpaRepository<BudgetItem, Long> {
}
