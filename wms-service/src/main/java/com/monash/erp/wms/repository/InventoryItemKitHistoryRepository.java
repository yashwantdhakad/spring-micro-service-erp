package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemKitHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemKitHistoryRepository extends JpaRepository<InventoryItemKitHistory, Long> {
}