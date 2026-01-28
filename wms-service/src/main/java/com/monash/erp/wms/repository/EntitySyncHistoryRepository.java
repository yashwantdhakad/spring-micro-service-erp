package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.EntitySyncHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntitySyncHistoryRepository extends JpaRepository<EntitySyncHistory, Long> {
}