package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShipmentItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentItemRepository extends JpaRepository<ShipmentItem, Long> {
    List<ShipmentItem> findByShipmentId(String shipmentId);

    void deleteByShipmentId(String shipmentId);
}
