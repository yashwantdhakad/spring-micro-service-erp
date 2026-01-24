package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentPackageRouteSeg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentPackageRouteSegRepository extends JpaRepository<ShipmentPackageRouteSeg, Long> {
    List<ShipmentPackageRouteSeg> findByShipmentId(String shipmentId);

    void deleteByShipmentId(String shipmentId);
}
