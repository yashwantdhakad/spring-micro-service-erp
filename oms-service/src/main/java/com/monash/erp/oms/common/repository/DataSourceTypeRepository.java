package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.DataSourceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceTypeRepository extends JpaRepository<DataSourceType, Long> {
}
