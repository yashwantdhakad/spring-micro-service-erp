package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.DataSourceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceTypeRepository extends JpaRepository<DataSourceType, Long> {
}