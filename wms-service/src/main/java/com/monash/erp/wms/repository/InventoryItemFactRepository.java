package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemFact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemFactRepository extends JpaRepository<InventoryItemFact, Long> {
}