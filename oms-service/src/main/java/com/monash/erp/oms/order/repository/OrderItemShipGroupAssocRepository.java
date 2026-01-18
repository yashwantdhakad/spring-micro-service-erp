package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemShipGroupAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemShipGroupAssocRepository extends JpaRepository<OrderItemShipGroupAssoc, Long> {
}
