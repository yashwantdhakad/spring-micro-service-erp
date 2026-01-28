package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.SalesOpportunityHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOpportunityHistoryRepository extends JpaRepository<SalesOpportunityHistory, Long> {
}