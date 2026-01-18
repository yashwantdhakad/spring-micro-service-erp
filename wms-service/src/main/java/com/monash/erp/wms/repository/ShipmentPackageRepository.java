package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentPackageRepository extends JpaRepository<ShipmentPackage, Long> {
}