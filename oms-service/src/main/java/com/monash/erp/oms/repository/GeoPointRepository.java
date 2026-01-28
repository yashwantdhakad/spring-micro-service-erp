package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.GeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoPointRepository extends JpaRepository<GeoPoint, Long> {
}