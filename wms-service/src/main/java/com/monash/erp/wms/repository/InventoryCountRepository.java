package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryCountRepository extends JpaRepository<InventoryCount, Long> {
}