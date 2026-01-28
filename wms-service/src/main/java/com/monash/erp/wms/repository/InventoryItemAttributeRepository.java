package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemAttributeRepository extends JpaRepository<InventoryItemAttribute, Long> {
}