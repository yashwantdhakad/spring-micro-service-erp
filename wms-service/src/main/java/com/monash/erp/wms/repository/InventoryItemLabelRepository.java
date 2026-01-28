package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemLabel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemLabelRepository extends JpaRepository<InventoryItemLabel, Long> {
}