package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlReconciliation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlReconciliationRepository extends JpaRepository<GlReconciliation, Long> {
}
