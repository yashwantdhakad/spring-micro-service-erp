package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.ShipmentItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentItemRepository extends JpaRepository<ShipmentItem, Long> {
}