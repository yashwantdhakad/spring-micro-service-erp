package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ItemIssuance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemIssuanceRepository extends JpaRepository<ItemIssuance, Long> {
    List<ItemIssuance> findByInventoryItemId(String inventoryItemId);
}
