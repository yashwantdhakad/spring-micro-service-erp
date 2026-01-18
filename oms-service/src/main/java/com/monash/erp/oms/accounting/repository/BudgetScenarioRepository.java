package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.BudgetScenario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetScenarioRepository extends JpaRepository<BudgetScenario, Long> {
}
