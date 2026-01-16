package com.example.erp.wms.ofbiz.repository;

import com.example.erp.wms.ofbiz.domain.ShipmentReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentReceiptRepository extends JpaRepository<ShipmentReceipt, Long> {
}