package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.DataSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceRepository extends JpaRepository<DataSource, Long> {
}