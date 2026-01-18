package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.GeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoPointRepository extends JpaRepository<GeoPoint, Long> {
}
