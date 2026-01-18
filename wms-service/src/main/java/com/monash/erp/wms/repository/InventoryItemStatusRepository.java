package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemStatusRepository extends JpaRepository<InventoryItemStatus, Long> {
}