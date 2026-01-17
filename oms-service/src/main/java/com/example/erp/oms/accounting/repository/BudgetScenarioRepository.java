package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.BudgetScenario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetScenarioRepository extends JpaRepository<BudgetScenario, Long> {
}
