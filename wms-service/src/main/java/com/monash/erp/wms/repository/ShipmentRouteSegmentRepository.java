package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentRouteSegment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentRouteSegmentRepository extends JpaRepository<ShipmentRouteSegment, Long> {
    List<ShipmentRouteSegment> findByShipmentId(String shipmentId);

    void deleteByShipmentId(String shipmentId);
}
