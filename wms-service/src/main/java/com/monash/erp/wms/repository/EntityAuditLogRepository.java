package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.EntityAuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityAuditLogRepository extends JpaRepository<EntityAuditLog, Long> {
}