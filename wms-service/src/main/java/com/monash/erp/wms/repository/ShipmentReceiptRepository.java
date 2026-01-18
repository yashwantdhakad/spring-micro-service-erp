package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentReceiptRepository extends JpaRepository<ShipmentReceipt, Long> {
}