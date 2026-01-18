package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemDetailRepository extends JpaRepository<InventoryItemDetail, Long> {
}