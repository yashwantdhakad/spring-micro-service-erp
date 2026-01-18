package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentAttributeRepository extends JpaRepository<ShipmentAttribute, Long> {
}