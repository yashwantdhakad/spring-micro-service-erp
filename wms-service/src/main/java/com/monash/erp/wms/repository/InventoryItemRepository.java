package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {
    Optional<InventoryItem> findFirstByInventoryItemIdOrderByIdAsc(String inventoryItemId);

    Page<InventoryItem> findByInventoryItemIdContainingIgnoreCaseOrProductIdContainingIgnoreCase(
            String inventoryItemId,
            String productId,
            Pageable pageable
    );

    default Optional<InventoryItem> findByInventoryItemId(String inventoryItemId) {
        return findFirstByInventoryItemIdOrderByIdAsc(inventoryItemId);
    }

    List<InventoryItem> findByProductIdAndFacilityId(String productId, String facilityId);

    List<InventoryItem> findByProductId(String productId);

    List<InventoryItem> findByInventoryItemIdIn(List<String> inventoryItemIds);
}
