package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentRouteSegment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRouteSegmentRepository extends JpaRepository<ShipmentRouteSegment, Long> {
}