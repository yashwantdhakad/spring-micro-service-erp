package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentGatewayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentGatewayConfigRepository extends JpaRepository<ShipmentGatewayConfig, Long> {
}