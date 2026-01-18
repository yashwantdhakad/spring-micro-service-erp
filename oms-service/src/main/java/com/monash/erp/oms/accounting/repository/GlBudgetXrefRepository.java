package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlBudgetXref;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlBudgetXrefRepository extends JpaRepository<GlBudgetXref, Long> {
}
