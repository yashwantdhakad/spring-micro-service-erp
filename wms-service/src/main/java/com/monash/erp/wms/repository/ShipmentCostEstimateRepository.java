package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentCostEstimate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentCostEstimateRepository extends JpaRepository<ShipmentCostEstimate, Long> {
}