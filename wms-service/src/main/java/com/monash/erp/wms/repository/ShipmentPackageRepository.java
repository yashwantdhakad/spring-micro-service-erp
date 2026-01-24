package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentPackageRepository extends JpaRepository<ShipmentPackage, Long> {
    List<ShipmentPackage> findByShipmentId(String shipmentId);

    void deleteByShipmentId(String shipmentId);
}
