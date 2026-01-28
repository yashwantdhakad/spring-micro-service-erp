package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}