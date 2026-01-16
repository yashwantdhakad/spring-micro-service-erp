package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {
}