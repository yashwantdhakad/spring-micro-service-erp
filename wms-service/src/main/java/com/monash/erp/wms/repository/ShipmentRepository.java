package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}