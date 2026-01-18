package com.monash.erp.oms.accounting.repository;

import com.monash.erp.oms.accounting.entity.GlAccountHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountHistoryRepository extends JpaRepository<GlAccountHistory, Long> {
}
