package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.GlAccountHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlAccountHistoryRepository extends JpaRepository<GlAccountHistory, Long> {
}