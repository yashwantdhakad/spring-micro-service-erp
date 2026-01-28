package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderShipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderShipmentRepository extends JpaRepository<OrderShipment, Long> {
}