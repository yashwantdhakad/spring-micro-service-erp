package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.PhysicalInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalInventoryRepository extends JpaRepository<PhysicalInventory, Long> {
}