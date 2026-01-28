package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.EntitySync;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntitySyncRepository extends JpaRepository<EntitySync, Long> {
}