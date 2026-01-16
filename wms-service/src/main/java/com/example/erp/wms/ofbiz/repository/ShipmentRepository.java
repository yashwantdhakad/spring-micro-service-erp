package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}