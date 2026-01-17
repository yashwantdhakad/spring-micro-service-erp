package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlReconciliationEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlReconciliationEntryRepository extends JpaRepository<GlReconciliationEntry, Long> {
}
