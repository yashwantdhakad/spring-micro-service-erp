package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {
    Optional<InventoryItem> findByInventoryItemId(String inventoryItemId);

    Page<InventoryItem> findByInventoryItemIdContainingIgnoreCaseOrProductIdContainingIgnoreCase(
            String inventoryItemId,
            String productId,
            Pageable pageable
    );
}
