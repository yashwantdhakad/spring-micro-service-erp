package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.PhysicalInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalInventoryRepository extends JpaRepository<PhysicalInventory, Long> {
}