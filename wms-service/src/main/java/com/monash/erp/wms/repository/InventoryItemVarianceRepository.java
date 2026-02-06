package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemVariance;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InventoryItemVarianceRepository extends JpaRepository<InventoryItemVariance, Long> {
    List<InventoryItemVariance> findByInventoryItemId(String inventoryItemId);
}
