package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemTypeRepository extends JpaRepository<InventoryItemType, Long> {
}