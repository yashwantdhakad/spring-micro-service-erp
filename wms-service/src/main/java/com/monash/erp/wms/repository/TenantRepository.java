package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}