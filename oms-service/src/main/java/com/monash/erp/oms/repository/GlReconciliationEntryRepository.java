package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.GlReconciliationEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlReconciliationEntryRepository extends JpaRepository<GlReconciliationEntry, Long> {
}