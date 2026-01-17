package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.GlAccountHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountHistoryRepository extends JpaRepository<GlAccountHistory, Long> {
}
