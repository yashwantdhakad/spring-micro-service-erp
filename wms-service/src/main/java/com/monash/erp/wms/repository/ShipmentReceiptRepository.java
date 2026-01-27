package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentReceiptRepository extends JpaRepository<ShipmentReceipt, Long> {
    List<ShipmentReceipt> findByShipmentId(String shipmentId);

    List<ShipmentReceipt> findByInventoryItemId(String inventoryItemId);

    List<ShipmentReceipt> findByOrderId(String orderId);

    void deleteByShipmentId(String shipmentId);

    void deleteByInventoryItemId(String inventoryItemId);
}
