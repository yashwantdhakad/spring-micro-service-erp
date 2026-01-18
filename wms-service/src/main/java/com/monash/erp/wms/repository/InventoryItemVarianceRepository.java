package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemVariance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemVarianceRepository extends JpaRepository<InventoryItemVariance, Long> {
}