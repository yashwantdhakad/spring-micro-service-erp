package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryItemDetailRepository extends JpaRepository<InventoryItemDetail, Long> {
    List<InventoryItemDetail> findByInventoryItemId(String inventoryItemId);

    List<InventoryItemDetail> findByWorkEffortId(String workEffortId);
}
