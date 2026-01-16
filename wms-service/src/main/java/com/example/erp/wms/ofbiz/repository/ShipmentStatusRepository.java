package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.ShipmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentStatusRepository extends JpaRepository<ShipmentStatus, Long> {
}