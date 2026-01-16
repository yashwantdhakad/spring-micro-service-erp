package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.InventoryItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemTypeRepository extends JpaRepository<InventoryItemType, Long> {
}