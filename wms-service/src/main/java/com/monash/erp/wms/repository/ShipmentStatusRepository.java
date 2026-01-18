package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentStatusRepository extends JpaRepository<ShipmentStatus, Long> {
}