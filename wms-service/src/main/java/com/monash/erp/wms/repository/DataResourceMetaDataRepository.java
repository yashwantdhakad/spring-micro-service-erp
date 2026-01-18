package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.DataResourceMetaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataResourceMetaDataRepository extends JpaRepository<DataResourceMetaData, Long> {
}