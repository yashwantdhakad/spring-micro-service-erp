package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.DataSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceRepository extends JpaRepository<DataSource, Long> {
}
