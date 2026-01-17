package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlReconciliation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlReconciliationRepository extends JpaRepository<GlReconciliation, Long> {
}
