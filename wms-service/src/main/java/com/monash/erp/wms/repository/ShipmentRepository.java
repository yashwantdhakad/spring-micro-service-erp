package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    Optional<Shipment> findByShipmentId(String shipmentId);

    Page<Shipment> findByShipmentIdContainingIgnoreCaseOrPrimaryOrderIdContainingIgnoreCase(
            String shipmentId,
            String primaryOrderId,
            Pageable pageable
    );
}
