package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentTypeRepository extends JpaRepository<ShipmentType, Long> {
}