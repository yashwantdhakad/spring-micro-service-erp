package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentItemBilling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentItemBillingRepository extends JpaRepository<ShipmentItemBilling, Long> {
}