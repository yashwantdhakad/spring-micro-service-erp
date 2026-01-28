package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ContainerGeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainerGeoPointRepository extends JpaRepository<ContainerGeoPoint, Long> {
}