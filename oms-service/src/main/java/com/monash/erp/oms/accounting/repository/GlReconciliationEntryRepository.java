package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlReconciliationEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlReconciliationEntryRepository extends JpaRepository<GlReconciliationEntry, Long> {
}
