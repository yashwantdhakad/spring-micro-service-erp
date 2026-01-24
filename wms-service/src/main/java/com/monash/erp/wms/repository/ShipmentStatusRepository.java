package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentStatusRepository extends JpaRepository<ShipmentStatus, Long> {
    List<ShipmentStatus> findByShipmentId(String shipmentId);

    void deleteByShipmentId(String shipmentId);
}
