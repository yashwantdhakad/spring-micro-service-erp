package com.monash.erp.wms.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OldInventoryRepository extends JpaRepository<OldInventoryItem, Long> {
    Optional<OldInventoryItem> findBySku(String sku);
}
