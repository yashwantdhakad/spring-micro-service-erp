package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.order.entity.OrderItemShipGroupAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemShipGroupAssocRepository extends JpaRepository<OrderItemShipGroupAssoc, Long> {
}
