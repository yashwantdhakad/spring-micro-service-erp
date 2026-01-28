package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.TenantDataSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantDataSourceRepository extends JpaRepository<TenantDataSource, Long> {
}