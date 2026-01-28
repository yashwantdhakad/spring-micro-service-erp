package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryCountItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryCountItemRepository extends JpaRepository<InventoryCountItem, Long> {
}