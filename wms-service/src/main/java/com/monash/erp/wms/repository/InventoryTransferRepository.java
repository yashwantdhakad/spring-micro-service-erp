package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.InventoryTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryTransferRepository extends JpaRepository<InventoryTransfer, Long> {
}