package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.InventoryItemStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemStatusRepository extends JpaRepository<InventoryItemStatus, Long> {
}