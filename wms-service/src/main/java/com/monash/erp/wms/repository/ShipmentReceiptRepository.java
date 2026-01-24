package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentReceiptRepository extends JpaRepository<ShipmentReceipt, Long> {
    List<ShipmentReceipt> findByShipmentId(String shipmentId);

    void deleteByShipmentId(String shipmentId);
}
