package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.DataResource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataResourceRepository extends JpaRepository<DataResource, Long> {
}