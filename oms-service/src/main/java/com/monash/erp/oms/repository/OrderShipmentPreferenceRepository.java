package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderShipmentPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderShipmentPreferenceRepository extends JpaRepository<OrderShipmentPreference, Long> {
}